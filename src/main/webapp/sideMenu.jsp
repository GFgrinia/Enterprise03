<c:choose>
    <c:when test="${!empty userEntity}">
        <c:set var="logState" value="Log-out"/>
        <c:set var="link_profile" value="/site_name/profile"/>
        <c:set var="link" value="/site_name/logout"/>
    </c:when>
    <c:otherwise>
        <c:set var="logState" value="Log-in"/>
        <c:set var="link_profile" value="/site_name/login"/>
        <c:set var="link" value="/site_name/login"/>
    </c:otherwise>
</c:choose>


        <div>
            <button class="collapsible" onclick="collapse(0)"><span>Info</span></button>
            <div class="content" style="position: relative; left: 20px">
                <button class="menu" style="text-decoration-line: line-through">Recommendations</button>
                <button class="menu" style="text-decoration-line: line-through">Bonuses</button>
            </div>
        </div>


        <div>
            <button class="collapsible" onclick="collapse(1)"><span>Account</span></button>
            <div class="content" style="position: relative; left: 20px">

                <a href=${link_profile}>
                    <button class="menu">Profile</button>
                </a>


                <a href=${link}>
                    <button class="menu">${logState}</button>
                </a>

            </div>
        </div>
