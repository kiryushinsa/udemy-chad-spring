<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
            <title>Custom login page</title>
            <style>
                .failed {
                    color: red;
                }
            </style>
    </head>

    <body>
        <h3>My custom login page</h3>
        <!-- /authenticateUser from DemoSecurityConfig -->
        <form:form action="${pageContext.request.contextPath}/authenticateUser" method="POST">

            <!-- check login error -->
            <c:if test="${param.error != null}">
                <i class="failed"> Invalid username or password </i>
            </c:if>


            <p>
                User name: <input type="text" name="username"/>
            </p>

            <p>
                Password: <input type="password" name="password"/>
            </p>

            <input type="submit" value="Login" />

        </form:form>
    </body>
</html>