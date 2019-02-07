<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
<form method="POST" action="process_form" >
<input type="number" name="op1" placeholder="enter the first number" />
<input type="number" name="op2" placeholder="enter the second number" />
<select name="op">
<option>Select Operation</option>
<option value="+" >Addition</option>
<option value="-" >Subtraction</option>
<option value="*" >Multiplication</option>
<option value="/" >Division</option>
<option value="%" >Remainder</option>
</select>
<input type="submit" name="submit" />
</form>
</body>
</html>
