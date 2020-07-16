<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login - Psybergate Pty Ltd</title>
<meta name="PersonSevlet" content="width=device-width, initial-scale=1.0">

<style>
	.input {
		border-radius: 6px;
		background-color: black;
		color: white;
		padding : 5px;
		width : 15%;
	}
	
	.button{
		color: white;
		background-color: green;
		border-radius: 5px;
		width : 10%;
		padding: 5px;
		
	}
</style>		
</head>
<body>
	<h1>Enter your Tax Number below</h1>
		<hr/>
		<form action="PersonSevlet" method="post">
		<tr><td>${SuccessMessage}</td></tr>
			<label>Tax Number: </label>
			<input type="text" name="taxNumber" autofocus="autofocus" required="required" placeholder="Enter your Tax Number here" class="input"/>
			<br/>
			<br/>
			<hr/>
			<input type="submit" value="Login" class="button"/>
		</form>
</body>
</html>