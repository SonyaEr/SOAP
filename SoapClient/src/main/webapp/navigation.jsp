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
<!--     Fonts and icons     -->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.1/css/all.css"
	integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
	crossorigin="anonymous">
<!-- CSS Files -->
<link href="css/bootstrap.min.css" rel="stylesheet" />
<link href="css/now-ui-kit.css?v=1.3.0" rel="stylesheet" />
<nav class="navbar navbar-expand-lg navbar-light bg-white">
	<!-- <a class="navbar-brand" href="${pageContext.servletContext.contextPath}/index">Home</a> -->
	<!-- <a class="navbar-brand" href="${pageContext.servletContext.contextPath}/editTour">Edit Tour</a> -->
	<div class="collapse navbar-collapse justify-content-end"
		id="navigation" data-nav-image="img/blurred-image-1.jpg">
		<ul class="navbar-nav">
			<c:if test="${person_role == 'none'}">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.servletContext.contextPath}/login">Login</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.servletContext.contextPath}/registration">Registration</a></li>
			</c:if>
			<c:if test="${person_role == 'admin'}">
				<li class="nav-item">${person_name}</li>
				<li class="nav-item"><a class="nav-link"
					href=${pageContext.servletContext.contextPath}/exit>Exit</a></li>
			</c:if>
			<c:if test="${person_role == 'user'}">
				<li class="nav-item">${person_name}</li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.servletContext.contextPath}/exit">Exit</a></li>
			</c:if>
			<c:if test="${person_role == 'manager'}">
				<li class="nav-item">${person_name}</li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.servletContext.contextPath}/exit">Exit</a></li>
			</c:if>
		</ul>
	</div>
</nav>