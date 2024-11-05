<%@ page import="javaweb.model.dto.UserDto"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %> <!-- 核心庫 -->
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %> <!-- 格式化庫 -->
<%@ taglib uri="jakarta.tags.functions" prefix="fn" %> <!-- 功能庫 -->
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>History</title>
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
	<body>
		<!-- menu bar include -->
		<%@ include file="/WEB-INF/view/menu.jspf" %>
		
		<!-- body content -->
		<div style="padding: 15px">
			<div class="pure-form">
				<fieldset>
					<legend>${ userCert.username } 的歷史訂單</legend>
					<table class="pure-table pure-table-bordered">
						<thead>
							<tr>
								<th align="center">訂單 Id</th><th align="center">使用者 Id</th ><th align="center">訂單日期</th>
								<th align="center">商品 Id</th><th align="center">商品名稱</th><th align="center">商品單價</th>
								<th align="center">訂購數量</th><th align="center">小計</th><th align="center">訂單狀態</th>
							</tr>
						</thead>
						<tbody>
						<!-- 設定 locale -->
							<fmt:setLocale value="${ locale }" />
							<c:forEach var="orderDto" items="${ orderFinishedDtos }">
								<tr>
									<td align="center">${ orderDto.orderId }</td>
									<td align="center">${ orderDto.userId }</td>
									<td>${ orderDto.orderDate }</td>
									<td align="center">${ orderDto.productId }</td>
									<td>${ orderDto.productName }</td>
									<td align="right">
										<fmt:formatNumber value="${ orderDto.unitPrice }" type="currency" maxFractionDigits="0" />
									</td>
									<td align="right">${ orderDto.quantity }</td>
									<td align="right">
										<fmt:formatNumber value="${ orderDto.subtotal }" type="currency" maxFractionDigits="0" />
									</td>
									<td>${ orderDto.orderStatus }</td>
								</tr>
							</c:forEach>
							<tr>
								<td colspan="9"></td>
							</tr>
							<c:forEach var="orderDto" items="${ orderCancelDtos }">
								<tr>
									<td align="center">${ orderDto.orderId }</td>
									<td align="center">${ orderDto.userId }</td>
									<td>${ orderDto.orderDate }</td>
									<td align="center">${ orderDto.productId }</td>
									<td>${ orderDto.productName }</td>
									<td align="right">
										<fmt:formatNumber value="${ orderDto.unitPrice }" type="currency" maxFractionDigits="0" />
									</td>
									<td align="right">${ orderDto.quantity }</td>
									<td align="right">
										<fmt:formatNumber value="${ orderDto.subtotal }" type="currency" maxFractionDigits="0" />
									</td>
									<td>${ orderDto.orderStatus }</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</fieldset>
			</div>
		</div>
	</body>
</html>