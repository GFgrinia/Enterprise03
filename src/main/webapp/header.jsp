<%@ page import="com.academy.model.entity.User" %>
<%@ page contentType="text/html" isELIgnored="false" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>

    <c:if test="${empty page_title}">
        <c:set var="page_title" value="Prototype"/>
    </c:if>
    <title>${page_title}</title>

    <link rel="stylesheet" href="css/main_style.css">
    <link rel="stylesheet" href="css/collapsible_menu.css">
    <script type="text/javascript" src="script/scripts.js"></script>
</head>

<body>
<%--Header--%>
<div class="wrap">

    <%--MainSite Button--%>
    <a href="index.jsp">
        <button class="header">#MainPage</button>
    </a>


    <c:choose>
        <c:when test="${!empty userEntity}">
            <c:set var="logState" value="Log-out"/>
            <c:set var="link" value="/site_name/logout"/>
            <c:set var="greeting_message" value="You are logged as:"/>
            <c:set var="displayed_name" value="${name}"/>
        </c:when>
        <c:otherwise>
            <c:set var="logState" value="Log-in"/>
            <c:set var="link" value="/site_name/login"/>
            <c:set var="greeting_message" value="You are not logged-in!"/>
            <c:set var="displayed_name" value=""/>
        </c:otherwise>
    </c:choose>


    <div class="horizontal-menu">
        <h3>${greeting_message}</h3>
    </div>


    <div class="horizontal-menu">
        <h3>${displayed_name}</h3>
    </div>


    <div class="horizontal-menu">
        <a href=${link}>
            <button class="login">${logState}</button>
        </a>
    </div>

</div>

<%--SideMenu--%>
<div class="wrap">
<%@ include file="sideMenu.jsp" %>