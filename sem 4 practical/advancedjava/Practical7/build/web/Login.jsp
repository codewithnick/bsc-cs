<%-- 
    Document   : Login
    Created on : Mar 19, 2021, 7:21:12 AM
    Author     : bot
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            String u=request.getParameter("username");
            String p=request.getParameter("password");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginform?autoReconnect=true&useSSL=false","root","root");
            Statement s= con.createStatement();
            String sql="select * from login where username='"+u+"' and password='"+p+"';";
            ResultSet r=s.executeQuery(sql);
            if(r.next())
            {%>
                <h1>hi <%=u %> login sucess full</h1>
            <%}
            else    
            {%>
            <h1>login unsucess full </h1>
               <%}%>
    </body>
</html>
