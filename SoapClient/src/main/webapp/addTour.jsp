<%@ include file="WEB-INF/jspf/taglib.jspf"%>
<%@ include file="WEB-INF/jspf/lib.jspf"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<%@ include file="WEB-INF/jspf/head.jspf"%>
</head>
<body>
	<jsp:include page="navigation.jsp" />
	<div class="container">
		<form action="${pageContext.servletContext.contextPath}/addTour" method="post">
			<div class="form-group">
				<label for="tourName">Tour Name</label> <input class="form-control"
					id="tourName" name="tour_name" placeholder="Enter tour name"
					required>
			</div>
			<div class="form-group">
				<label for="tourDesription">Tour Description</label> <input
					class="form-control" id="tourDescription" name="tour_description"
					placeholder="Enter tour description" required>
			</div>
			<div class="form-group">
				<label for="quantityNight">Quantity Night</label> <input
					class="form-control" id="quantityNight" name="quantity_night"
					placeholder="Enter quantity night" required>
			</div>
			<div class="form-group">
				<label for="tourOperator">Tour Operator</label> <input
					class="form-control" id="tourOperator" name="tour_operator"
					placeholder="Enter tour operator" required>
			</div>

			<div class="form-group">
				<label for="typeFood">Type food</label> <select name="type_food"
					class="custom-select">
					<c:forEach var="typefood" items="${type_food}">
						<option value="${typefood}">${typefood}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="typeTransport">Type transport</label> <select name="type_transport"
					class="custom-select">
					<c:forEach var="typetransport" items="${type_transport}">
						<option value="${typetransport}">${typetransport}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="typeTour">Type tour</label> <select name="type_tour"
					class="custom-select">
					<c:forEach var="typetour" items="${type_tour}">
						<option value="${typetour}">${typetour}</option>
					</c:forEach>
				</select>
			</div>
			<button class="btn btn-success">Add</button>
		</form>

	</div>
</body>
</html>