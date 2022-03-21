
<!DOCTYPE html>
<html lang="ru">
<head>
    <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="WEB-INF/1.jspf" %>
    <style>
        body {
            background: #fff;
            color: #5c5c5c;
            line-height: 1.4em;
            font-size: 14px;
            font-family: 'FuturaPT', Arial, sans-serif;
        }

        div {
            display: block;
        }

        .tbr_item1 {
            font: 14px/20px Bliss Pro ExtraLight;
            color: #787879;
            padding: 15px 0 15px 0;
            border-top: 1px solid #cfd0d4;
        }

        .tbr_item1 span {
            color: #000000;
        }

        .tbr_item2 {
            font: 14px/20px Bliss Pro ExtraLight;
            color: #787879;
            padding: 10px 0 15px 0;
            border-top: 1px solid #cfd0d4;
        }

        .mb5 {
            margin-bottom: 3px;
        }

        .tbri3_style3 {
            color: #222;
            font-size: 25px;
            font-weight: 500;
        }

        .tbr_item3 {
            padding: 20px 0 20px 0;
            border-top: 1px solid #cfd0d4;
        }

        .tbr_item4 input[type="text"] {
            display: inline-block;
            vertical-align: middle;
            width: 40px;
            height: 24px;
            padding: 0;
            text-align: center;
            border: 1px solid #cfd0d4;
            background: #ffffff;
        }

        .tbr_item4 input[type="password"] {
            display: inline-block;
            vertical-align: middle;
            width: 40px;
            height: 24px;
            padding: 0;
            text-align: center;
            border: 1px solid #cfd0d4;
            background: #ffffff;
        }

        .tbri4b1_cart {
            display: inline-block;
            vertical-align: top;
            font: 14px/14px Bliss Pro ExtraLight;
            color: #ffffff;
            text-transform: uppercase;
            padding: 14px 18px 14px 45px;
            text-decoration: none;
            background: url(https://wedding-market.ua/pic/pic80.png) center top no-repeat;
        }

        .tbri4b1_cart:hover {
            color: #ffffff;
            text-decoration: none;
            filter: alpha(opacity=90);
            opacity: 0.9;
        }

        .tbr_item4 {
            display: inline-block;
            padding: 20px 0;
            border-top: 1px solid #cfd0d4;
        }

        .tbr_item5 {
            padding: 20px 0;
            border-top: 1px solid #cfd0d4;
        }
    </style>
</head>
<body>
<div style="max-width: 70%;margin: 30px">
    <c:forEach var="tour" items="${tours}">
        <div class="tb_right">
            <div class="tbr_item1">
                <div>Номер: <span>${tour.id}</span></div>
                <div>Название: <span>${tour.name}</span></div>
                <div>Цвет: <span>${tour.description}</span></div>
            </div>
        </div>
    </c:forEach>
    <div class="container" style="align-content: center;margin-top: 20px">
        <form id="add" action="/add" method="post">
            <input type="hidden" name="command" value="redirect"/>
            <p>
                <button type="submit" class="btn btn-success">Добавить</button>
            </p>
        </form>
    </div>
</div>
</body>
</html>