<%-- 
    Document   : Voter_home
    Created on : 16 Mar, 2019, 5:03:57 PM
    Author     : MY PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<title>Voter Profile</title>
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
      <li><a class="current" href="#">Voter's Profile</a></li>
      
      <li><a href="Party_list.jsp">Party List</a></li>
      <li><a  href="generate_token.jsp">Apply for Vote</a></li>
      <li class="last"><a href="Logout.jsp">Logout</a></li>
    </ul>
  </div>
</div>
        
<div class="wrap">
  <div id="main">
    <div class="wrap">
        <h1>WELCOME:  &nbsp&nbsp&nbsp  <%= session.getAttribute("name").toString().toUpperCase()  %> </h1>
     
       <div class="line"></div>
       <br>
      <table>
              <tr>
                  <td>
                      <h2> YOUR VOTER ID:</h2> 
                  </td>
                  <td>
                      <h2>  <%= session.getAttribute("voter_id")  %></h2> 
                  </td>
              </tr>
              <tr>
                  <td>
                     <h2>AADHAR NUMBER:&nbsp&nbsp&nbsp </h2> 
                  </td>
                  <td>
                      <h2>  <%= session.getAttribute("adhaar")  %></h2> 
                  </td>
              </tr>
              <tr>
                  <td>
                     <h2>MOBILE NUMBER:</h2>  
                  </td>
                  <td>
                     <h2>   <%= session.getAttribute("mobile")  %></h2> 
                  </td>
              </tr>
              <tr>
                  <td>
                    <h2>   YOU BELONGS TO: </h2> 
                  </td>
                  <td>
                      <h2>  <%= session.getAttribute("state")%> STATE</h2> 
                  </td>
              </tr>
              <tr>
                  <td>
                     <h2>  YOUR DISTRICT: </h2> 
                  </td>
                  <td>
                      <h2>  <%= session.getAttribute("district")%> </h2> 
                  </td>
              </tr>
           </table>
      </div>
   <div class="line"></div>
</div>
                  
 
                  
  <div id="side">
       <img src="images/ecicall.jpg" />
  </div>
  <div id="footer">
 
      <div class="r">  <h3 class="title">© Election Commission of India. All rights reserved </h3>
      </div>
      </div>
</div>
 </body>
</html>
