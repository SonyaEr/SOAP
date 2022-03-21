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
		<form action="${pageContext.servletContext.contextPath}/addOrder" method="post">
			<div class="form-group">
				<label for="count">Tour Name</label> <input class="form-control"
					id="count" name="count" placeholder="Enter count tourists"
					required>
			</div>
			<button class="btn btn-success">Add</button>
		</form>

	</div>
</body>
</html>