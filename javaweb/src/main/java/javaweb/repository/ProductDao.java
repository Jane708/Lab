package javaweb.repository;

import java.util.List;
import java.util.Map;

import javaweb.model.entity.Product;

// User (DAO: Data Access Object)
// 建立 CRUD 的方法
public interface ProductDao {
	
	// 多筆: 查詢所有產品
	List<Product> findAllProducts();
	
	// Map<商品名稱(product_name), 銷售金額 (total_sales)>
		Map<String, Double> querySalesRanking(); // 銷售排行
	
	// 單筆: 根據 productname 查詢該筆產品名
	Product getProduct(String productname);
	
	// 新增
	void addProduct(Product product);
	
	// 修改
	void updateProduct(Integer productId, String productname);
		
	// 刪除: 根據 productId 來刪除
	void deleteProduct(Integer productId);

}