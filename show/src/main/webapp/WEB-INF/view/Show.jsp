<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="model.dto.ShowDto" %>
<%@page import="java.util.List" %>
    
<% 
	List<ShowDto> showDtos = (List<ShowDto>)request.getAttribute("showDtos");
%>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@3.0.0/build/base-min.css">
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
			.textarea {
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
		<form class="pure-form" method="post" action="/show/add">
			<fieldset>
				<legend>Show 新增</legend>
				節目名稱:　<input type="text" name="showname" placeholder="請輸入showname" required><p />
				節目日期:　<input type="date" name="showtime" required><p />
				人數限制:　<input type="text" name="limitpeople" required><p />
				內容簡介:　<input class="textarea" name="showintro" required><p />
			</fieldset>
		</form>
		<p />
		
		<div class="pure-form">
			<fieldset>
				<legend>Show 列表</legend>
				<table class="pure-table pure-table-horizontal">
					<thead>
						<tr>
							<th>ID</th><th>名稱</th><th>日期</th><th>人數限制</th><th>簡介</th>
				
						</tr>
					</thead>
					<% for(ShowDto showDto : showDtos) {%>
						<tr>
							<td><%=showDto.getShowId() %></td>
							<td><%=showDto.getShowname() %></td>
							<td><%=showDto.getShowtime() %></td>
							<td><%=showDto.getLimitpeople() %></td>
						</tr>
					<%} %>
				</table>
			</fieldset>
		</div>
	</body>
</html>