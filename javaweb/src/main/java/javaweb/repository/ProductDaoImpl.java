package javaweb.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javaweb.model.entity.Product;

public class ProductDaoImpl extends BaseDao implements ProductDao{

	@Override
	public List<Product> findAllProducts() {
		List<Product> products = new ArrayList<>();
		String sql = "select product_id, product_name, price, stock_quantity from product";
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setPrice(rs.getDouble("price"));
				product.setStockQuantity(rs.getInt("stock_quantity"));
				// 注入到 products 集合
				products.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return products;
	}

	@Override
	public Product getProduct(String productname) {
		String sql = "select product_id, product_name, price, stock_quantity from product where productname = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, productname);
			
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					Product product = new Product();
					product.setProductId(rs.getInt("product_id"));
					product.setProductName(rs.getString("product_name"));
					product.setPrice(rs.getDouble("price"));
					product.setStockQuantity(rs.getInt("stock_quantity"));
					
					return product; //返回 product 物件
				}
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addProduct(Product product) {
		String sql = "insert into products(product_name, price, stock_quantity) values(?,?,?)";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, product.getProductName());
			pstmt.setDouble(2, product.getPrice());
			pstmt.setInt(3, product.getStockQuantity());
			
			
			int rowcount = pstmt.executeUpdate();
			
			if(rowcount != 1) {
				throw new RuntimeException("新增失敗! ");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateProduct(Integer productId, String productname) {
		String sql = "update product set productname = ? where product_id = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, productname);
			pstmt.setInt(2, productId);
			
			int rowcount = pstmt.executeUpdate();
			
			if(rowcount != 1) {
				throw new RuntimeException("修改失敗! userId: "+ productId + "active: " + productname);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct(Integer productId) {
		String sql = "delete from products where product_id = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setInt(1, productId);
			
			int rowcount = pstmt.executeUpdate();
			if(rowcount != 1) {
				throw new RuntimeException("刪除失敗 productId:" + productId);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	// 存放銷售排行
	@Override
	public Map<String, Double> querySalesRanking() {
		String sql = """
				SELECT p.product_name, SUM(o.subtotal) AS total_sales
				FROM orders o
				LEFT JOIN product p ON o.product_id = p.product_id
				GROUP BY p.product_name
				ORDER BY total_sales DESC
				""".trim();
		// 存放銷售排行 map
		Map<String, Double> map = new LinkedHashMap<>();
		
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				
				String key = rs.getString("product_name");
				Double value = rs.getDouble("total_sales");
				// 將排行放到 map 集合中
				map.put(key, value);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
	}
}
