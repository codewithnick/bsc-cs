
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            Student First Name : <jsp:getProperty name="B1" property="SFName"/><br>
            Student Last Name : <jsp:getProperty name="B1" property="SLName"/><br>
            Student Age : <jsp:getProperty name="B1" property="SAge"/><br>
        </h1>
    </body>
</html>