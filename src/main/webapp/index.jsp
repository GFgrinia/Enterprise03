<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Prototype</title>

    <link rel="stylesheet" href="view/style.css">
    <script type="text/javascript" src="view/scripts.js"></script>


</head>

<body onload="openMenu('Main')">


<jsp:include page="view/header.jsp"/>


    <div class="wrap">

        <jsp:include page="view/sideMenu.jsp"/>

        <div class="horizontal-block">
            <jsp:include page="view/sideInfo.jsp"/>
        </div>

    </div>



</body>
</html>
