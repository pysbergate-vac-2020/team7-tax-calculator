<!DOCTYPE html>

<html>
	<head>
		<title>Tax Information - Psybergate Pty Ltd</title>
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
		<h1>Enter Your Tax Information Below</h1>
		<hr/>
		<form action="view" method="post">
			<!--  <label>Tax Year: </label>
			<input type="number" name="taxyear" autofocus="autofocus" required="required" placeholder="2020" class="input"/>
			<br/>
			<br/> -->
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
			<input type="number" name="purchaseprice" required="required" placeholder="0.00" class="input"/>
			<input type="number" name="additionalexpenses" required="required" placeholder="0.00" class="input"/>
			<input type="number" name="sellingprice" required="required" placeholder="0.00" class="input"/>
			<br/>
			<br/>
			<input type="submit" value="Calculate Tax" class="button"/>
			<br/>
			<br/>
			<label>Total Tax To Pay: </label>
			<input type="number" name="totaltax"  placeholder="0.00" class="input"/>
			<br/>
			<br/>
			<hr/>
		</form>
	</body>
</html>