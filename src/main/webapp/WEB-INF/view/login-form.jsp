<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
            <title>Custom login page</title>
    </head>

    <body>
        <h3>My custom login page</h3>
        <!-- /authenticateUser from DemoSecurityConfig -->
        <form:form action="${pageContext.request.contextPath}/authenticateUser" method="POST">
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