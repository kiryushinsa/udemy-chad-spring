<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>Welcome to JSP kiryushinsa page</title>
    </head>

    <body>
        <h2>
            Welcome to introduction in Spring Security
        </h2>

        <hr>
            <p>
                USER: <security:authentication property="principal.username" />
                <br>
                ROLE: <security:authentication property="principal.authorities" />
            </p>
        <hr>

        <hr>
            Double welcome home page

            <form:form action="${pageContext.request.contextPath}/logout" method="post">
                <input type="submit" value="Logout" />
            </form:form>
    </body>
</html>