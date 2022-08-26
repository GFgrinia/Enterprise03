<%
    // Update link to "only for logged user" pages
    if (session.getAttribute("user") != null) {
        request.setAttribute("link_profile", "\"/site_name/profile\"");
        request.setAttribute("link", "\"/site_name/logout\"");
        request.setAttribute("logState", "Log-out");
    } else {
        request.setAttribute("link_profile", "\"/site_name/login\"");
        request.setAttribute("link", "\"/site_name/login\"");
        request.setAttribute("logState", "Log-in");
    }
%>


<div>
    <button class="collapsible" onclick="collapse(0)"><span>Info</span></button>
    <div class="content" style="position: relative; left: 20px">
        <button class="menu" onclick="openMenu('Recommendations')">Recommendations</button>
        <button class="menu" onclick="openMenu('Bonuses')">Bonuses</button>
    </div>
</div>


<div>
    <button class="collapsible" onclick="collapse(1)"><span>Account</span></button>
    <div class="content" style="position: relative; left: 20px">

        <a href=<%= request.getAttribute("link_profile") %>>
            <button class="menu">Profile</button>
        </a>


        <a href=<%= request.getAttribute("link") %>>
            <button class="menu"><%= request.getAttribute("logState") %>
            </button>
        </a>

    </div>
</div>

