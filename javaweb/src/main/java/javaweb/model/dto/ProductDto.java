package javaweb.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	
	private Integer productId; // 產品ID
	private String productname; // 產品名稱
	private Double price; //價格
	private Integer stockquantity; //庫存

}
