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
			<div class="page-header page-header-the_smallest">
				<div class="page-header-image" data-parallax="true"
					style="background-image: url(img/video.png)"></div>
			</div>
			<div class="container">
				<section id="gallery">
					<h2 class="mb-5 font-weight-bold text-center">Tour Page</h2>
					<div class="row">
						<div class="col-md-6 mb-4">
							<div id="carousel-example-1z"
								class="carousel slide carousel-fade carousel-fade"
								data-ride="carousel">
								<ol class="carousel-indicators">
									<li data-target="#carousel-example-1z" data-slide-to="0"
										class="active"></li>
									<li data-target="#carousel-example-1z" data-slide-to="1"></li>
									<li data-target="#carousel-example-1z" data-slide-to="2"></li>
								</ol>
								<div class="carousel-inner z-depth-1-half" role="listbox">
									<div class="carousel-item active">
										<img class="d-block w-100" src="img/Italy1.jpg"
											alt="First slide">
									</div>
									<div class="carousel-item">
										<img class="d-block w-100" src="img/Italy2.jpg"
											alt="Second slide">
									</div>
									<div class="carousel-item">
										<img class="d-block w-100" src="img/Italy3.jpg"
											alt="Third slide">
									</div>
								</div>
								<a class="carousel-control-prev" href="#carousel-example-1z"
									role="button" data-slide="prev"> <span
									class="carousel-control-prev-icon" aria-hidden="true"></span> <span
									class="sr-only">Previous</span>
								</a> <a class="carousel-control-next" href="#carousel-example-1z"
									role="button" data-slide="next"> <span
									class="carousel-control-next-icon" aria-hidden="true"></span> <span
									class="sr-only">Next</span>
								</a>
							</div>
						</div>
						<div class="col-md-6">
							<a href="" class="teal-text">
								<h6 class="pb-1">
									<i class="fa fa-heart"></i><strong>
										${tour.getTourName()} </strong>
								</h6>
							</a>
							<p>Description: ${tour.getTourDescription()}</p>
							<p>Quantity night: ${tour.getQuantityNight()}</p>
							<p>Tour operator: ${tour.getTourOperator()}</p>
							<p>Type food: ${tour.getTypeFood().getTypeFoodName()}</p>
							<p>Type transport:
								${tour.getTypeTransport().getTypeTransportName()}</p>
							<p>Type tour: ${tour.getTypeTour().getTypeTourName()}</p>

						</div>
					</div>
				</section>
				<div class="jumbotron-tour">
					<h3>Dates & Prices</h3>

					<table class="table">
						<thead>
							<tr>
								<th scope="col" class="align-middle">Date Arrival</th>
								<th scope="col" class="align-middle">Name</th>
								<th scope="col" class="align-middle">Price</th>
								<th scope="col" class="align-middle">Total</th>
								<th scope="col" class="align-middle"><div
										class="quantity_wr_2">
										<div class="quantity_inner">
											<button class="bt_minus">
												<svg viewBox="0 0 24 24">
													<line x1="5" y1="12" x2="19" y2="12"></line></svg>
											</button>
											<input type="text" value="1" size="2" class="quantity"
												name="tour_date_count" data-max-count="20" />
											<button class="bt_plus">
												<svg viewBox="0 0 24 24">
													<line x1="12" y1="5" x2="12" y2="19"></line>
													<line x1="5" y1="12" x2="19" y2="12"></line></svg>
											</button>
										</div>
									</div>
									<div class="container"></div></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="tourdate" items="${tourdates}" varStatus="loop">
								<tr class="rowTourDate">
									<td style="vertical-align: middle">${tourdate.getDateArrival()}</td>
									<td style="vertical-align: middle">${tourdate.getTourDateName()}</td>
									<td style="vertical-align: middle">&euro; <input
										id="price${loop.index}" type="text"
										value="${tourdate.getPrice()}" size="2" readonly="readonly" />
									</td>
									<td style="vertical-align: middle">&euro; <input
										id="summa${loop.index}" type="text"
										value="${tourdate.getPrice()}" size="2" readonly="readonly" />
									</td>
									<td class="align">
										<form id="addOrder"
											action="${pageContext.servletContext.contextPath}/tour"
											method="post">
											<input type="hidden" name="tour_date_id"
												value="${tourdate.getId()}" /> 
											<input type="hidden" id="count_id"
												name="tour_date_count" value="1" />
											<button class="btn btn-info">Buy</button>
										</form>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
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


			<script>
				// Убавляем кол-во по клику
				$('.quantity_inner .bt_minus')
						.click(
								function() {
									let $input = $(this).parent().find(
											'.quantity');
									let count = parseInt($input.val()) - 1;
									count = count < 1 ? 1 : count;
									$input.val(count);
									var size = document
											.getElementsByClassName('rowTourDate').length;
									for (var i = 0; i < size; i++) {
										document.getElementById('summa' + i).value = parseInt(document
												.getElementById('price' + i).value)
												* count;
									}
									document.getElementById('count_id').value=count; 
								});
				// Прибавляем кол-во по клику
				$('.quantity_inner .bt_plus')
						.click(
								function() {
									let $input = $(this).parent().find(
											'.quantity');
									let count = parseInt($input.val()) + 1;
									count = count > parseInt($input
											.data('max-count')) ? parseInt($input
											.data('max-count'))
											: count;
									$input.val(parseInt(count));
									var size = document
											.getElementsByClassName('rowTourDate').length;
									for (var i = 0; i < size; i++) {
										document.getElementById('summa' + i).value = parseInt(document.getElementById('price' + i).value) * count;
									}
									document.getElementById('count_id').value=count; 
								});
				// Убираем все лишнее и невозможное при изменении поля
				$('.quantity_inner .quantity')
						.bind(
								"change keyup input click",
								function() {
									if (this.value.match(/[^0-9]/g)) {
										this.value = this.value.replace(
												/[^0-9]/g, '');
									}
									if (this.value == "") {
										this.value = 1;
									}
									if (this.value > parseInt($(this).data(
											'max-count'))) {
										this.value = parseInt($(this).data(
												'max-count'));
									}
									var size = document
											.getElementsByClassName('rowTourDate').length;
									for (var i = 0; i < size; i++) {
										document.getElementById('summa' + i).value = parseInt(document
												.getElementById('price' + i).value)
												* this.value;
									}
									document.getElementById('count_id').value=this.value; 
								});
			</script>
		</div>
	</div>
</body>
</html>