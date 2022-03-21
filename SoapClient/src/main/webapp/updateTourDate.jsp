<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="navigation.jsp" />
	<div class="container">
		<form action="${pageContext.servletContext.contextPath}/updateTour"
			method="post">

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

		</form>
	</div>
</body>
</html>