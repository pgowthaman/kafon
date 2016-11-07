<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier</title>
<style>
body {
	background-image: url("/resources/login.jpg");
	background-repeat: no-repeat;
	background-size: 600px;
}

div.supplier {
	text-align: center;
	border: 0px;
	margin-top: 100px;
	margin-left: 500px;
	margin-right: 500px;
	margin-bottom: 110px;
	padding: 20px;
}
</style>
</head>
<body>
<div class="supplier">
<h1>Supplier</h1>
<form>
<table>
<tr>
	<td><label path="id" for="id">SupplierId</label></td>
	<td>:</td>
	<td><input type="text" path="id" id="id" name="id"
						placeholder="supplierId"></td>
</tr>
<tr>
	<td><label for="name">SupplierName</label></td>
	<td>:</td>
	<td><input type="text" path="name" id="name" name="name"
						placeholder="supplierName"/></td>
</tr>
<tr>
	<td><label for="address">SupplierAddress</label></td>
	<td>:</td>
	<td><input type="text" path="address" id="address" name="address"
						placeholder="supplierAddress"/></td>
</tr>
</table>
<a href="#"> <input type="submit" value="save"></a> <a
				href="#"> <input type="button" value="delete"></a>						 
</form>
</div>
</body>
</html>