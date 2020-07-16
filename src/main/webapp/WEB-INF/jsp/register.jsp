<!DOCTYPE html>

<html>
	<head>
		<title>Customer Information - Psybergate Pty Ltd</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

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
		<h1>Enter your information below</h1>
		<hr/>
		<form action="PersonSevlet" method="post">
			<label>Tax Number: </label>
			<input type="text" name="taxNumber" autofocus="autofocus" required="required" placeholder="Enter your Tax Number here" class="input"/>
			<br/>
			<br/>
			<label>Name: </label>
			<input type="text" name="name" required="required" placeholder="Enter your Name here" class="input"/>
			<br/>
			<br/>
			<label>Surname: </label>
			<input type="text" name="surname" required="required" placeholder="Enter your surname here" class="input"/>
			<br/>
			<br/>
			<label>Annual Salary: </label>
			<input type="number" name="salary" required="required" placeholder="0.00" class="input"/>
			<br/>
			<br/>
			<label>Retirement Contributions (Total): </label>
			<input type="number" name="retirement" required="required" placeholder="0.00" class="input"/>
			<br/>
			<br/>
			<label>Interest Income: </label>
			<input type="number" name="interest" required="required" placeholder="0.00" class="input"/>
			<br/>
			<br/>
			<label>Travel Allowance: </label>
			<input type="number" name="allowance" required="required" placeholder="0.00" class="input"/>
			<br/>
			<br/>
			<label>Capital Gain: </label>
			<input type="number" name="capitalgain" required="required" placeholder="0.00" class="input"/>
			<br/>
			<br/>
			<hr/>
			<input type="submit" value="Register" class="button"/>
		</form>
	</body>
</html>