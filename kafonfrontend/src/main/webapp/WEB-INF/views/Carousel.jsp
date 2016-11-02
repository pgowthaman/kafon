<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome to KAFON</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	margin: auto;
}
</style>
</head>
<body>

	<div class="container">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">

				<div class="item active">
					<img src="D:\eclipse\kafonfrontend\src\main\resources\image\home1.jpeg" alt="books"
						width="460" height="345">
					<div class="carousel-caption">
						<h3>kafon</h3>

					</div>
				</div>

				<div class="item">
					<img src="D:\eclipse\kafonfrontend\src\main\resources\image\home2.jpeg" alt="books"
						width="460" height="345">
					<div class="carousel-caption">
						<h3>Knowledge</h3>

					</div>
				</div>

				<div class="item">
					<img src="D:\eclipse\kafonfrontend\src\main\resources\image\home3.jpg" alt="books"
						width="460" height="345">
					<div class="carousel-caption">
						<h3>Fun</h3>

					</div>
				</div>

				<div class="item">
					<img src="D:\eclipse\kafonfrontend\src\main\resources\image\home4.jpeg" alt="books"
						width="460" height="345">
					<div class="carousel-caption">
						<h3>In hand</h3>

					</div>
				</div>

			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>

</body>
</html>