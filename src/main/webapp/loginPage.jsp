<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login Form</title>
    <link rel="stylesheet" href="view/style.css">
    <script type="text/javascript" src="view/scripts.js"></script>
</head>

<body>
<jsp:include page="view/header.jsp"/>

<div class="wrap">


    <form action="login" method="post">
        <input type="text" name="username" value="Username..." onclick="this.value=''"/><br/>
        <input type="password" name="password" value="Password..." onclick="this.value=''"/><br/>
        <input type="submit" value="Log-in"/>
    </form>


    <%
        if (request.getAttribute("message") == null) {
            request.setAttribute("message", "");
        }
    %>
    <p><%= request.getAttribute("message") %>
    </p>

</div>


</body>
</html>

