<%@ include file="header.jsp"%>


        <div  class="horizontal-block">
            <div class="table-content">
                <form action="login" method="post">
                    <input type="text" name="username" value="Username..." onclick="this.value=''"/><br/>
                    <input type="password" name="password" value="Password..." onclick="this.value=''"/><br/>
                    <input type="submit" value="Log-in"/>
                </form>

                <c:if test="${empty message}">
                    <c:set var="message" value=""/>
                </c:if>

                <p>${message}</p>

            </div>
        </div>

    </div>


<%@ include file="footer.jsp"%>

