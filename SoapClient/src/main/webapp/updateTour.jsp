<%@ include file="WEB-INF/jspf/taglib.jspf"%>
<%@ include file="WEB-INF/jspf/lib.jspf"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<%@ include file="WEB-INF/jspf/head.jspf"%>
</head>
<body>
	<jsp:include page="navigation.jsp" />
	<div class="container">
		<form action="${pageContext.servletContext.contextPath}/updateTour"
			method="post">
			<div class="form-group">
				<label for="tourName">Tour Name</label> <input class="form-control"
					id="tourName" name="tour_name" placeholder="Enter tour name"
					value="${tour.getTourName()}" required>
			</div>
			<div class="form-group">
				<label for="tourDesription">Tour Description</label> <input
					class="form-control" id="tourDescription" name="tour_description"
					placeholder="Enter tour description"
					value="${tour.getTourDescription()}" required>
			</div>
			<div class="form-group">
				<label for="quantityNight">Quantity Night</label> <input
					class="form-control" id="quantityNight" name="quantity_night"
					placeholder="Enter quantity night"
					value="${tour.getQuantityNight()}" required>
			</div>
			<div class="form-group">
				<label for="tourOperator">Tour Operator</label> <input
					class="form-control" id="tourOperator" name="tour_operator"
					placeholder="Enter tour operator" value="${tour.getTourOperator()}"
					required>
			</div>

			<div class="form-group">
				<label for="typeFood">Type food</label> <select name="type_food"
					value="${tour.getTypeFood().getTypeFoodName()}"
					class="custom-select">
					<c:forEach var="typefood" items="${type_food}">
						<c:if test="${typefood == tour.getTypeFood().getTypeFoodName()}">
							<option value="${typefood}" selected="selected">${typefood}</option>
						</c:if>
						<c:if test="${typefood != tour.getTypeFood().getTypeFoodName()}">
							<option value="${typefood}">${typefood}</option>
						</c:if>		
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="typeTransport">Type transport</label> <select
					name="type_transport"
					value="${tour.getTypeTransport().getTypeTransportName()}"
					class="custom-select">
					<c:forEach var="typetransport" items="${type_transport}">
						<c:if test="${typetransport == tour.getTypeTransport().getTypeTransportName()}">
							<option value="${typetransport}" selected="selected">${typetransport}</option>
						</c:if>
						<c:if test="${typetransport != tour.getTypeTransport().getTypeTransportName()}">
							<option value="${typetransport}">${typetransport}</option>
						</c:if>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="typeTour">Type tour</label> <select name="type_tour"
					class="custom-select">
					<c:forEach var="typetour" items="${type_tour}">
						<c:if test="${typetour == tour.getTypeTour().getTypeTourName()}">
							<option value="${typetour}" selected="selected">${typetour}</option>
						</c:if>
						<c:if test="${typetour != tour.getTypeTour().getTypeTourName()}">
							<option value="${typetour}">${typetour}</option>
						</c:if>
					</c:forEach>
				</select>
			</div>
			<button class="btn btn-success">Change</button>
		</form>

	</div>
</body>
</html>