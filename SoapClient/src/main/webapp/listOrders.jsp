<%@ include file="WEB-INF/jspf/taglib.jspf"%>
<%@ page import="java.util.List"%>
<%@ page import="ua.silentium.entity.vouchers.Order"%>
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
<link href="css/bootstrap.min.css" rel="stylesheet" />
<link href="css/now-ui-kit.css?v=1.3.0" rel="stylesheet" />
</head>
<body class="landing-page sidebar-collapse">
	<div class="wrapper">
		<nav
			class="navbar navbar-expand-lg bg-primary fixed-top navbar-transparent "
			color-on-scroll="400">
			<div class="container">
				<div class="dropdown button-dropdown">
					<a class="dropdown-toggle" id="navbarDropdown"
						data-toggle="dropdown"> <span class="button-bar"></span> <span
						class="button-bar"></span> <span class="button-bar"></span>
					</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item"
							href="${pageContext.servletContext.contextPath}/editTour">Edit
							Tour</a> <a class="dropdown-item"
							href="${pageContext.servletContext.contextPath}/index">List
							Order</a> <a class="dropdown-item"
							href="${pageContext.servletContext.contextPath}/index">List
							Voucher</a>
					</div>
				</div>
				<div class="navbar-translate">
					<a class="navbar-brand"
						href="${pageContext.servletContext.contextPath}/index">
						Silentium </a>
					<button class="navbar-toggler navbar-toggler" type="button"
						data-toggle="collapse" data-target="#navigation"
						aria-controls="navigation-index" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-bar top-bar"></span> <span
							class="navbar-toggler-bar middle-bar"></span> <span
							class="navbar-toggler-bar bottom-bar"></span>
					</button>
				</div>
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
							<li class="nav-item"><a class="nav-link"
								href=${pageContext.servletContext.contextPath}/profile>${person_name}</a></li>
							<li class="nav-item"><a class="nav-link"
								href=${pageContext.servletContext.contextPath}/exit>Exit</a></li>
						</c:if>
						<c:if test="${person_role == 'user'}">
							<li class="nav-item"><a class="nav-link"
								href=${pageContext.servletContext.contextPath}/profile>${person_name}</a></li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.servletContext.contextPath}/exit">Exit</a></li>
						</c:if>
						<c:if test="${person_role == 'manager'}">
							<li class="nav-item"><a class="nav-link"
								href=${pageContext.servletContext.contextPath}/profile>${person_name}</a></li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.servletContext.contextPath}/exit">Exit</a></li>
						</c:if>

					</ul>
				</div>
			</div>
		</nav>
		<div class="wrapper">
			<div class="page-header page-header-small">
				<div class="page-header-image" data-parallax="true"
					style="background-image: url(img/video.png)"></div>
				<div class="content-center">
					<div class="card-header text-center">
						<div class="logo-container">
							<img src="img/now-logo.png" alt="">
						</div>
					</div>
					<div class="container">
						<h1 class="title">Silentium</h1>
						<div class="text-center"></div>
					</div>
				</div>
			</div>

			<div class="container">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Count</th>
							<th scope="col">Order date</th>
							<th scope="col">Order update date</th>
							<th scope="col">№ Client</th>
							<th scope="col">№ Tour date</th>
							<th scope="col"> Status order</th>
							<th scope="col">Choose</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="o" items="${orders}" varStatus="loop">
							<tr>
								<td>${o.getOrderCount()}</td>
								<td>${o.getOrderDate().toGregorianCalendar().toZonedDateTime()}</td>
								<td>${o.getDateUpdatedOrder().toGregorianCalendar().toZonedDateTime()}</td>
								<td>${o.getPerson().getId()}</td>
								<td>${o.getTourDate().getId()}</td>
								<td>${o.getStatusOrder().getStatusOrderName()}</td>
								<td>
									<form id="getTour"
										action="${pageContext.servletContext.contextPath}/tour"
										method="get">
										<input type="hidden" name="tour_id" value="${t.getId()}" /> <input
											type="hidden" value="gettour" />
										<button class="btn btn-info">Choose</button>
									</form>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<section id="contact">
					<h2 class="mb-4 font-weight-bold text-center">Contact us</h2>
					<div class="row">
						<div class="col-lg-12 col-md-12">
							<div class="row text-center">
								<div class="col-lg-4 col-md-12 mb-3">
									<p>
										<i class="fa fa-map fa-1x mr-2 grey-text"></i>Ukraine, Kharkiv
									</p>
								</div>
								<div class="col-lg-4 col-md-6 mb-3">
									<p>
										<i class="fa fa-building fa-1x mr-2 grey-text"></i>Mon - Fri,
										8:00-22:00
									</p>
								</div>
								<div class="col-lg-4 col-md-6 mb-3">
									<p>
										<i class="fa fa-phone fa-1x mr-2 grey-text"></i>+38097833966
									</p>
								</div>
							</div>
						</div>
					</div>
				</section>
			</div>
			<script src="js/plugins/bootstrap-switch.js"></script>
			<script src="js/plugins/nouislider.min.js" type="text/javascript"></script>
			<script src="js/plugins/bootstrap-datepicker.js"
				type="text/javascript"></script>
			<script
				src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
			<script src="js/now-ui-kit.js?v=1.3.0" type="text/javascript"></script>
			<script src="js/core/jquery.min.js" type="text/javascript"></script>
			<script src="js/core/popper.min.js" type="text/javascript"></script>
			<script src="js/core/bootstrap.min.js" type="text/javascript"></script>


			<script>
				$(document).ready(function() {
					// the body of this function is in assets/js/now-ui-kit.js
					nowuiKit.initSliders();
				});

				function scrollToDownload() {

					if ($('.section-download').length != 0) {
						$("html, body").animate({
							scrollTop : $('.section-download').offset().top
						}, 1000);
					}
				}
			</script>
		</div>
	</div>
</body>
</html>