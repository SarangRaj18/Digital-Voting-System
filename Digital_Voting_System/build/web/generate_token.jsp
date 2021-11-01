<%-- 
    Document   : generate_token
    Created on : 20 Mar, 2019, 5:45:29 PM
    Author     : MY PC
--%>
<%@ page import="java.sql.*" %> 
<%@ page import="Upyogi.DBconnect" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello generate token</h1>
        
        <%
            String voter_id= session.getAttribute("voter_id").toString();
            try{
            String sql1="select * from voting_time where voter_id='"+
                  voter_id+"' ";
            String sql2="";
            DBconnect db=new DBconnect();
            ResultSet rs=db.queryReturner(sql1);
            if(rs.next())
            {
                out.print("You have already Applied to Vote");
                response.sendRedirect("Token_generated.jsp");
            }
            else
            {
                sql2="insert into voting_time values('"+voter_id+"',token.nextval,'t')";
                db.queryExecuter(sql2);
                response.sendRedirect("Token_generated.jsp");
            }
            }
            catch(Exception ex)
            {
                out.print(ex);
            }
            %>
    </body>
</html>
