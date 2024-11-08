<%@page import="javaweb.model.dto.UserDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	UserDto userDto = (UserDto)request.getAttribute("userDto");
%> 
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
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
        
        .radio-group {
            display: flex;
            flex-direction: row;
            gap: 10px; /* 調整按鈕之間的間距 */
        }
        
        textarea {
			  width: 80%;
			  height: 150px;
			  padding: 12px 20px;
			  box-sizing: border-box;
			  border: 2px solid #ccc;
			  border-radius: 4px;
			  background-color: #f8f8f8;
			  resize: none;
		}
        
    </style>
	</head>
	
	<body style="padding: 15px">
		<td style="padding-left: 65px" valign="top">
			<form class="pure-form pure-form-aligned" method="post" action="/javaweb/user/help">
				<fieldset>
					<legend> User 您好，很高興為您服務！</legend>
					請輸入電子郵件: <input type="text" name="userId" placeholder="email" /><p /> 
					請選擇您遇到的問題: 
					<div class="radio-group">
						<input type="radio" name="active" value="001" />購票
			 			<input type="radio" name="active" value="002" />退票
			 			<input type="radio" name="active" value="003" />密碼
			 			<input type="radio" name="active" value="004" />系統
					</div>
					<p />
					<textarea>客服人員您好：</textarea>
					
					<p />
					<button type="submit" class="button-success pure-button"> Submit </button>	  
				</fieldset>
			</form>
		</td>
	</body>
</html>