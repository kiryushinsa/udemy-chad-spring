<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            Double welcome home page

            <form:form action="${pageContext.request.contextPath}/logout" method="post">
                <input type="submit" value="Logout" />
            </form:form>
    </body>
</html>