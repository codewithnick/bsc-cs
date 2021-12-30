<%-- 
    Document   : Delete
    Created on : Mar 19, 2021, 8:46:09 AM
    Author     : bot
--%>

<%@page import="java.sql.PreparedStatement"%>
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
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginform?autoReconnect=true&useSSL=false","root","root");
                PreparedStatement s=c.prepareStatement("delete from login where username =? and password=?");
                s.setString(1, u);
                s.setString(2, p);
                /*
                create table login(username varchar(20),password varchar(20));
                */
                 int r=s.executeUpdate();                                              
                 out.println("deletion sucessful");
            %>
    </body>
</html>
