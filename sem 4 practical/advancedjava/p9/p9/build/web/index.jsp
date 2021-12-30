
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <s:form action="Login">
        <s:textfield name="id" label="Login Id" ></s:textfield>
        <s:textfield name="pass" label="Password"></s:textfield>
        <s:submit value="submit"></s:submit>
    </s:form>
    </body>
</html>
