<%@page import="javaweb.model.dto.ProductDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %> <!-- 格式化庫 -->

<%
	// 得到 ProductServlet 所傳來的資料
	List<ProductDto> productDtos = (List<ProductDto>)request.getAttribute("productDtos");
%>    

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Product</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<style>
        .button-success,
        .button-error,
        .button-warning,
        .button-secondary {
            color: white;
            border-radius: 4px;
            text-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
        }

        .button-success {
            background: rgb(28, 184, 65);
            /* this is a green */
        }

        .button-error {
            background: rgb(202, 60, 60);
            /* this is a maroon */
        }

        .button-warning {
            background: rgb(223, 117, 20);
            /* this is an orange */
        }

        .button-secondary {
            background: rgb(66, 184, 221);
            /* this is a light blue */
        }
    </style>
	</head>
	
	<body style="padding: 20px">
		<!-- menu bar include -->
		<%@include file="/WEB-INF/view/menu.jspf" %>
	
		<form class="pure-form" method="post" action="/javaweb/product/add">
				<fieldset>
					<legend>Product 新增</legend>
					產品名稱: <input type="text" name="productname" placeholder="請輸入產品名稱" required /><p /> 
					產品價格: <input type="text" name="productprice" placeholder="請輸入產品價格" required /><p /> 
					產品庫存: <input type="text" name="stockquantity" placeholder="請輸入產品庫存量" required /><p />
					<button class="pure-button" type="reset">Reset</button>
					<button class="button-success pure-button" type="submit">Submit</button>	  
				</fieldset>
		</form>
		<p />
	
		<div>
			<fieldset>
				<legend>Product 列表</legend>
				<table border="1" class="pure-table">
					<thead>
						<tr>
							<th>商品ID</th><th>產品名稱</th><th>商品價格</th><th>產品庫存量</th>
							<th>刪除</th>
						</tr>
					</thead>
					<% for(ProductDto productDto : productDtos) { %>
						<tr>
							<td><%=productDto.getProductId() %></td>
							<td><%=productDto.getProductname() %></td>
							<td><%=productDto.getPrice() %></td>
							<td><%=productDto.getStockquantity() %></td>
							<td><a href="http://localhost:8080/javaweb/product/delete?productId=<%=productDto.getProductId() %>" class="button-error pure-button">刪除</a></td>
						</tr>
					<% } %>
				</table>
			</fieldset>
		</div>
	</body>
</html>