<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="wrap">

    <a href="/site_name/index.jsp">
        <button class="header" onclick="openMenu('Main')">#MainPage</button>
    </a>

    <%
        //Update variables  depending on login status
        if (session.getAttribute("user") != null) {
            request.setAttribute("logState", "Log-out");
            request.setAttribute("link", "\"/site_name/logout\"");
            request.setAttribute("greeting-message", "You are logged as:");
            request.setAttribute("displayed-name", session.getAttribute("user"));
        } else {
            request.setAttribute("logState", "Log-in");
            request.setAttribute("link", "\"/site_name/login\"");
            request.setAttribute("greeting-message", "You are not logged-in.");
            request.setAttribute("displayed-name", "");
        }
    %>

    <div class="horizontal-menu">
        <h2><%= request.getAttribute("greeting-message") %>
        </h2>
    </div>


    <div class="horizontal-menu">
        <h1><%= request.getAttribute("displayed-name") %>
        </h1>
    </div>


    <div class="horizontal-menu">
        <a href=<%= request.getAttribute("link") %>>
            <button class="login"><%= request.getAttribute("logState") %>
            </button>
        </a>
    </div>

</div>
