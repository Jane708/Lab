<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
	<style>
	form {
				height: 100%;
				margin: 40px;
				display: flex;
				justify-content: center;
				align-items: center;
			}
			.wrapper {
				text-align: center;
			}
	
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
	
	<body style="padding: 20px">
	
		<!-- menu bar include -->
		<%@include file="/WEB-INF/view/menu.jspf" %>
	
		<form class="pure-form" method="post" action="/javaweb/login">
			<fieldset>
				<legend>🛒 Login</legend>
				🔒 : <input type="text" name="username" placeholder="請輸入帳號" required><p />
				🔐 : <input type="password" name="password" placeholder="請輸入密碼" required><p />
				<button type="reset" class="pure-button">重置</button>
				<button type="submit" class="pure-button pure-button-primary">登入</button>
			
			</fieldset>
		
		</form>
	
	</body>
</html>