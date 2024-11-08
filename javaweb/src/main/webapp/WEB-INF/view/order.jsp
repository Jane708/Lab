<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %> <!-- 核心庫 -->
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Order</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<style>
	
	.button-success, .button-error, .button-warning, .button-secondary {
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
	
	.radio-group {
		display: flex;
		flex-direction: row;
		gap: 10px; /* 調整按鈕之間的間距 */
	}
	</style>
	</head>
	
	<body style="padding: 15px">
		<!-- menu bar include -->
		<%@include file="/WEB-INF/view/menu.jspf" %>
		
		<form class="pure-form" method="post" action="/javaweb/order">
			<fieldset>
				<legend>訂購商品</legend>
				<table class="pure-table">
					<thead>
						<tr>
							<th>商品 id</th><th>商品名稱</th><th>商品單價</th><th>目前庫存</th><th>下單數量</th>
						</tr>
					</thead>
					<tbody>
							<tr>
								<td>
									1
									<input type="hidden" name="productId" value="1" >
								</td>
								<td>PC</td>
								<td>
									30000
									<input type="hidden" name="unitPrice" value="30000" >
								</td>
								<td>50</td>
								<td><input type="number" name="amount" style="width: 100px" value="0" min="0" max="50"></td>
							</tr>
							<tr>
								<td>
									2
									<input type="hidden" name="productId" value="2" >
								</td>
								<td>Mobile</td>
								<td>
									15000
									<input type="hidden" name="unitPrice" value="15000" >
								</td>
								<td>100</td>
								<td><input type="number" name="amount" style="width: 100px" value="0" min="0" max="100"></td>
							</tr>
							<tr>
								<td>
									3
									<input type="hidden" name="productId" value="3" >
								</td>
								<td>MusicBox</td>
								<td>
									3000
									<input type="hidden" name="unitPrice" value="3000" >
								</td>
								<td>200</td>
								<td><input type="number" name="amount" style="width: 100px" value="0" min="0" max="200"></td>
							</tr>
							<tr>
								<td>
									4
									<input type="hidden" name="productId" value="4" >
								</td>
								<td>Pad</td>
								<td>
									20000
									<input type="hidden" name="unitPrice" value="20000" >
								</td>
								<td>75</td>
								<td><input type="number" name="amount" style="width: 100px" value="0" min="0" max="75"></td>
							</tr>
							<tr>
								<td>
									5
									<input type="hidden" name="productId" value="5" >
								</td>
								<td>Watch</td>
								<td>
									8000
									<input type="hidden" name="unitPrice" value="80000" >
								</td>
								<td>150</td>
								<td><input type="number" name="amount" style="width: 100px" value="0" min="0" max="150"></td>
							</tr>
					</tbody>
				</table>
				<button type="reset" class="button-warning pure-button">Reset</button>
				<button type="submit" class="button-success pure-button">Submit</button>	  
			</fieldset>
		</form>
		<p />
		
	</body>
</html>