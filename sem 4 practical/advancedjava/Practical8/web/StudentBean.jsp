


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
          String a=request.getParameter("SFName");
            String b=request.getParameter("SLName");
            String c=request.getParameter("SAge");
            
        %>
        <jsp:useBean id="B1" class="Bean.SBean" scope="request">
            <jsp:setProperty name="B1" property="SFName" value="<%=a%>"/>
            <jsp:setProperty name="B1" property="SLName" value="<%=b%>"/>
            <jsp:setProperty name="B1" property="SAge" value="<%=c%>"/>
        </jsp:useBean>
        <jsp:forward page="display.jsp"/>
    </body>
</html>