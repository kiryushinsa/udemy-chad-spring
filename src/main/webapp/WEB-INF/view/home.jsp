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
            <!-- Link to /leaders will be output only for users with MANAGER role -->
            <security:authorize access="hasRole('MANAGER')">
                <p>
                    <a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a>
                    (Only for managers)
                </p>
            </security:authorize>

            <!-- Link to /systems will be output only for users with ADMIN role -->
            <security:authorize access="hasRole('ADMIN')">
                <p>
                    <a href="${pageContext.request.contextPath}/systems">Admin Console</a>
                    (Only for admins)
                </p>
            </security:authorize>


        <hr>
            Double welcome home page

            <form:form action="${pageContext.request.contextPath}/logout" method="post">
                <input type="submit" value="Logout" />
            </form:form>
    </body>
</html>