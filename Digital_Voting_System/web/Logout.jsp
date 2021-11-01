<%-- 
    Document   : Logout
    Created on : 16 Mar, 2019, 6:24:26 PM
    Author     : MY PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <% session.removeAttribute("name");
        session.removeAttribute("voter_id");
        response.sendRedirect("Voter_login.jsp");
            %>
    </body>
</html>
