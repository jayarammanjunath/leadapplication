<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Register Form</title>
</head>
<body>
<h1>Enter the Details To Fill The Lead</h1>
<form action="savedetail" method="post">
<table>
<tr><th>fname</th>
<th><input type="text" name="fname"></th>
</tr>
<tr><th>lname</th>
<th><input type="text" name="lname"></th>
</tr>
<tr><th>city</th>
<th><input type="text" name="city"></th>
</tr>
<tr><th>email</th>
<th><input type="text" name="email"></th>
</tr>
<tr><th>mobile</th>
<th><input type="text" name="mobile"></th>
</tr>
</table>
<input type="submit" value="save">
</form>
${msg}
</body>
</html>