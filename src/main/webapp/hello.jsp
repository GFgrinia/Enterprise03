<%--
  Created by IntelliJ IDEA.
  User: grinia
  Date: 24.08.2022
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hello Page</title>
    <link rel="stylesheet" href="view/style.css">
    <script type="text/javascript" src="view/scripts.js"></script>
</head>

<body onload="openMenu('Data')">


<jsp:include page="view/header.jsp"/>

<div class="wrap">

    <jsp:include page="view/sideMenu.jsp"/>

    <div class="horizontal-block">
        <jsp:include page="view/sideInfo.jsp"/>

        <div id="Data" class="table-content">
            <p>Hello: <%= request.getAttribute("name") %>
            </p>
        </div>

    </div>

</div>


</body>
</html>