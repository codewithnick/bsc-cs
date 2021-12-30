<%-- 
    Document   : registration
    Created on : Mar 19, 2021, 8:18:52 AM
    Author     : bot
--%>

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
            String sql="insert into login values('"+u+"','"+p+"');";
            int r=s.executeUpdate(sql);
        %>
        <h1> registration sucessfull </h1>
    </body>
</html>
