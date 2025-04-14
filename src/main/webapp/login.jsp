<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>	Login Page</title>
</head>
<body>
	
	<h2> User Login</h2>
	
	<form action = "LoginServlet" method= post>
		
		<table>
		
				<tr>
					<td> Enter Name </td>
					<td> <input type = text name = textName> </td>	
				</tr>
				<tr>
					<td> Enter Password </td>
					<td> <input type = password name = textpwd></td>
				</tr>
				<tr>
					<td><input type = submit value = login></td>
					<td><input type = reset></td>
				</tr>
		</table>
	
	
	
	</form>
</body>
</html>