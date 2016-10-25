<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
 <title>Welcome to KAFON</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
   h1,h5
  {
  display:inline;
  }
  
  </style>
</head>
<body>
<header>
<h1>KAFON</h1><h5>(Konwledge And Fun ONline)</h5>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li class="active"><a href="index.html">Home<span class="glyphicon glyphicon-home"></span> </a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Categories <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
		<li><a href="#">Contact</a></li>
      <li><a href="#">About</a></li>
      <li>Search <input type="text" placeholder="search,catogeries,booknames,authors...." size="45"></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
    <c:if test="${not empty success}">
      <li><a href="#">my cart <span class="glyphicon glyphicon-shopping-cart"></span></a></li>
      <li><a href="#">Logout <span class="glyphicon glyphicon-log-out"></span></a></li>
      </c:if>
    <c:if test="${empty success}">
      <li><a href="register">Signup <span class="glyphicon glyphicon-user"></span></a></li>
      <li><a href="login">Login <span class="glyphicon glyphicon-log-in"></span></a></li>
      </c:if>
    </ul>
  </div>
</nav>
</header>
</body>
</html>
   