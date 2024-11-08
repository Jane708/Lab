package javaweb.service;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javaweb.model.dto.*;
import javaweb.model.entity.Product;
import javaweb.model.entity.User;
import javaweb.repository.*;
import javaweb.utils.Hash;


//(給UserServlet(Controller)使用)
public class ProductService {
	
	private ProductDao productDao = new ProductDaoImpl();
	
	//所有產品
	public List<ProductDto> findAllProducts(){	
		List<ProductDto> productDtos = new ArrayList<>();
		//將 Product 轉 ProductDto
		//向 productDao 索取 List<Product>
		List<Product> products = productDao.findAllProducts();
		
		// 一個個將 Product 轉成 ProductDto 並放在 productDtos 集合中
		// 可參考老師之寫法
		for(Product product : products) {
			ProductDto productDto = new ProductDto();
			productDto.setProductId(product.getProductId());
			productDto.setProductname(product.getProductName());
			productDto.setPrice(product.getPrice());
			productDto.setStockquantity(product.getStockQuantity());
			
			productDtos.add(productDto);
		}
		
		return productDtos;
	}
	
	//新增使用者
	public void appendProduct(String productname, Double price, Integer stockquantity) {
		
		Product product = new Product();
		product.setProductName(productname);
		product.setPrice(price);
		product.setStockQuantity(stockquantity);
		
		productDao.addProduct(product);
	}

	public void deleteProduct(String prouductId) {
		productDao.deleteProduct(Integer.parseInt(prouductId));
		
	}
	
	public Map<String, Double> querySalesRanking() {
		return productDao.querySalesRanking();
	}
	
}
