<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Result</title>
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
		<form class="pure-form">
			<h1>Result</h1>
			<h2>訊息: ${ message }</h2>
			<h2>憑證: ${ userCert }</h2>
			 <li class="pure-menu-item">
			    <a href="/javaweb/user/update/password" class="button-warning">進入修改密碼頁面</a>
			 </li>
		 	<li class="pure-menu-item">
			    <a href="/javaweb/user" class="button-success">進入首頁</a>
			</li>
		</form>
	</body>
</html>