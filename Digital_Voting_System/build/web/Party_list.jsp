<%-- 
    Document   : Party_list
    Created on : 16 Mar, 2019, 6:36:26 PM
    Author     : MY PC
--%>
<%@page import="java.io.OutputStream"%>
<%@page import="javax.swing.ImageIcon"%>
<%@ page import="java.sql.*" %> 
<%@ page import="Upyogi.DBconnect" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<title>Party List</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<link rel="stylesheet" href="css2/main.css" type="text/css" />
</head>
    <body>
        
        <div id="header">
     
  <div class="wrap">
      <br>
    <img src="images/eci3.png" />
       <br>
       <br>
    <ul id="menu">
      <li><a  href="Voter_home.jsp">Voter's Profile</a></li>
      
      <li><a class="current" href="#">Party List</a></li>
      <li><a  href="generate_token.jsp">Apply for Vote</a></li>
      <li class="last"><a href="Logout.jsp">Logout</a></li>
    </ul>
  </div>
</div>
        
        
        
        <link rel="stylesheet" href="css3/style.css">
        
         
      
   <div class="table-users">
   <div class="header">List of the Parties are:</div>
     
   <table cellspacing="0">
      <tr>
          <th><h2>Party Name</h2> </th>
         <th><h2>Candidate Name</h2> </th>
           <th><h2>District</h2> </th>
         <th><h2>Symbol </h2></th>
      </tr>

             <%
                      try
                {
                    DBconnect x = new DBconnect();
                    String party_name="";
                    String voter_id =
                            session.getAttribute("voter_id").toString();
                    String state=session.getAttribute("state").toString();
                    String district=session.getAttribute("district").toString();
                    String sql = "select * from candidate_reg where state='"+
                            state+"' and district='"+district+"'";
                    
                    ResultSet rs = x.queryReturner(sql);
      
                    while(rs.next())
                    {
                        
                        party_name=rs.getString("party");
                        
                          out.println("<tr>");
                          out.println("<td><h3>"+party_name);
                          out.println("</h3></td>");
                        
                          String candidate_name="";
                          candidate_name=rs.getString("name");
                          
                           String district_name="";
                          district_name=rs.getString("district");
                          
                          out.println("<td><h3>"+candidate_name);
                          out.println("</h3></td>");
                          out.println("<td><h3>"+district_name);
                          out.println("</h3></td>");
                          
                          
                          String photo=rs.getString("logo");
                          out.println("<td><img src = Photos/"+
                          photo+" alt=HTML5 Icon height=100 width=100 />");
                          out.println("</td>");
                         out.println("</tr>");
                    }  
                }
                 catch(Exception ex)
                 {
                          out.println(ex);
                      }
                %>
      
   </table>
          
</div>
             <div class="r">  <h3 class="title">© Election Commission of India. All rights reserved </h3>
      </div>
</body>
</html>
