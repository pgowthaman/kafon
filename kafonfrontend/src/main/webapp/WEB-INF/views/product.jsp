<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<form>
<table>
<tr>
	<td><label for="id">ProductId</label></td>
	<td>:</td>
	<td><input type="text" id="id" name="id"
						placeholder="ProductId"></td>
</tr>
<tr>
	<td><label for="name">ProductName</label></td>
	<td>:</td>
	<td><input type="text" id="name" name="name"
						placeholder="ProductName"></td>
</tr>
<tr>
	<td><label for="price">Price</label></td>
	<td>:</td>
	<td><input type="text" id="price" name="price"
						placeholder="Productprice"></td>
</tr>
<tr>
	<td><label for="category">Category</label></td>
	<td>:</td>
	<td><input type="text" id="category" name="category"
						placeholder="Productcetagory"></td>
</tr>

<tr>
	<td><label for="description">Description</label></td>
	<td>:</td>
	<td><input type="text" id="description" name="description"
						placeholder="Description"></td>
</tr>
</table>
</form>


</body>
</html>