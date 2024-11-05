<%@page import="javaweb.model.dto.UserDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!-- 核心庫 -->


<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Sales Ranking</title>
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
					<legend>銷售排行</legend>
					${ salesRankingMap }
				</fieldset>
			</div>
		</div>
	</body>
</html>