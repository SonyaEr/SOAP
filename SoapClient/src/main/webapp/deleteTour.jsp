<%@ include file="WEB-INF/jspf/taglib.jspf"%>
<%@ page import="java.util.List"%>
<%@ page import="ua.silentium.entity.vouchers.Tour"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="WEB-INF/jspf/head.jspf"%>
<meta charset="UTF-8">
<title>Silentium</title>
<script type="text/javascript" src="js/jquery-1.8.0.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		var selItem = localStorage.getItem("locales");
		$('#locales').val(selItem ? selItem : 'en');
		$("#locales").change(function() {
			var selectedOption = $('#locales').val();
			if (selectedOption) {
				window.location.replace('?lang=' + selectedOption);
				localStorage.setItem("locales", selectedOption);
			}
		});
	});
</script>
<meta charset="utf-8" />
<link rel="apple-touch-icon" sizes="76x76" href="img/apple-icon.png">
<link rel="icon" type="image/png" href="img/icon.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>Silentium</title>
<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no'
	name='viewport' />
<!--     Fonts and icons     -->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.1/css/all.css"
	integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
	crossorigin="anonymous">
<!-- CSS Files -->
<link href="css/tour.css" rel="stylesheet" />
<link href="css/bootstrap.min.css" rel="stylesheet" />
<link href="css/now-ui-kit.css?v=1.3.0" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<h3 class="title">Do you want to delete this tour?</h3>
		<div class="text-center"></div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Description</th>
					<th scope="col">Quantity Night</th>
					<th scope="col">Tour Operator</th>
					<th scope="col">Type Food</th>
					<th scope="col">Type Transport</th>
					<th scope="col">Type Tour</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${tour.getTourName()}</td>
					<td>${tour.getTourDescription()}</td>
					<td>${tour.getQuantityNight()}</td>
					<td>${tour.getTourOperator()}</td>
					<td>${tour.getTypeFood().getTypeFoodName()}</td>
					<td>${tour.getTypeTransport().getTypeTransportName()}</td>
					<td>${tour.getTypeTour().getTypeTourName()}</td>

					<td></td>
				</tr>
			</tbody>
		</table>
		<div>
			<form id="deleteOK"
				action="${pageContext.servletContext.contextPath}/deleteTour"
				method="post" class="line">
				<input type="hidden" name="tour_id" value="${tour.getId()}" /> <input
					type="hidden" name="mode" value="delete" />
				<button class="btn btn-success">Delete</button>
			</form>
			<form id="deleteCancel"
				action="${pageContext.servletContext.contextPath}/deleteTour"
				method="post" class="line">
				<input type="hidden" name="tour_id" value="${tour.getId()}" /> <input
					type="hidden" name="mode" value="cancel" />
				<button class="btn btn-danger">Cancel</button>
			</form>
		</div>
	</div>
</body>
</html>