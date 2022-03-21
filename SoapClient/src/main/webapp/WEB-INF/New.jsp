<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title>JSP Timing</title>
</head>
<body>
	<h5>Список Туров</h5>

	<div >

		<form id="register_form" action="/add" method="POST">
			<input type="hidden" name="command" value="add" /> <input type="text"
				id="id" name="id"
				style="width: 100%; text-align: left; padding: 3px;"
				placeholder="Впишите айди"> Id:
				
			<input type="text" id="name" name="name"
				style="width: 100%; text-align: left; padding: 3px;"
				placeholder="Впишите имя"> Name:
			 <input type="text" id="description" name="description"
				style="width: 100%; text-align: left; padding: 3px;"
				placeholder="Впишите описание"> Description:
			<input type="text" id="quantityNight" name="quantityNight"
				style="width: 100%; text-align: left; padding: 3px;"
				placeholder="Впишите Количевство дней"> 
				
            
		</form>
	</div>
</body>
</html>
