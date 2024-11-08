<%@page import="javaweb.model.dto.UserDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%><!-- 核心庫 -->

<%
	UserDto userDto = (UserDto)request.getAttribute("userDto");
%>   
    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>User 修改</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/pure-min.css">
		<link rel="stylesheet" href="/javaweb/CSS/buttons.css">
		
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
	
	<body style="padding: 15px">
	
		<!-- menu bar include -->
		<%@include file="/WEB-INF/view/menu.jspf" %>
	
		<table>
		
		<div style="padding: 50px" class="pure-menu custom-restricted-width">
		    <ul class="pure-menu-list">
			     <li class="pure-menu-item pure-menu-selected">
            		<a href="#" class="pure-menu-link">修改使用者資料</a>
       			 </li>
		        <li class="pure-menu-item">
		            <a href="/javaweb/user/help" class="pure-menu-link">聯絡客服人員</a>
		        </li>
		        <li class="pure-menu-item">
		            <a href="/javaweb/user" class="pure-menu-link">返回主頁面</a>
		        </li>

		    </ul>
		</div>
			
		<td valign="top">
				<form class="pure-form" method="post" action="/javaweb/user/update">
					<fieldset>
						<legend>User 修改</legend>
						序號: <input type="text" name="userId" value="<%=userDto.getUserId() %>" readonly /><p /> 
						帳號: <input type="text" name="username" value="<%=userDto.getUsername() %>" readonly /><p /> 
						電郵: <input type="email" name="email" value="<%=userDto.getEmail() %>" readonly /><p />
						狀態: <input type="radio" name="active" value="true"  <%=userDto.getActive()?"checked":"" %> />True
							 <input type="radio" name="active" value="false" <%=userDto.getActive()?"":"checked" %>  />False <p />
						權限: <select name="role">
								<option value="ROLE_ADMIN" <%=userDto.getRole().equals("ROLE_ADMIN")?"selected":"" %>>ADMIN</option>
								<option value="ROLE_USER"  <%=userDto.getRole().equals("ROLE_USER")?"selected":"" %>>USER</option>
							  </select><p />
						<button type="submit" class="button-success pure-button">Update</button>	  
					</fieldset>
				</form>
			</td>
			<td style="padding-left: 30px" valign="top">
				<form class="pure-form" method="post" action="/javaweb/user/update/password" >
					<fieldset>
						<legend>User 修改密碼(請自行實現)</legend>
						<input type="hidden" name="userId" value="<%=userDto.getUserId() %>" readonly /><p /> 
						<input type="hidden" name="username" value="<%=userDto.getUsername() %>" readonly /><p />
						舊密碼: <input type="password" name="password"><p /> 
						新密碼: <input type="password" name="newPassword"><p />
						<button type="submit" class="button-success pure-button">Update Password</button>	  
					</fieldset>
				</form>
			</td>
			
		</table>
		
		
	</body>
</html>