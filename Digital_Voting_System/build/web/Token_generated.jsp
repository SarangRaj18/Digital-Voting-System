<%-- 
    Document   : Token_generated
    Created on : 20 Mar, 2019, 6:52:50 PM
    Author     : MY PC
--%>
<%-- 
    Document   : Token_generated
    Created on : 20 Mar, 2019, 6:52:50 PM
    Author     : MY PC
--%>
<%@ page import="java.sql.*" %> 
<%@ page import="Upyogi.DBconnect" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
<title>Apply for Vote</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<link rel="stylesheet" href="css2/main.css" type="text/css" />



<link href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" rel="stylesheet">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
 body {
	 font: 1.25em Sans-Serif; color: #444; background: #f4f4f4; line-height: 1.6em; 
	}   
        
        h1 { letter-spacing: -0.04em; font-size: 1.8em; text-shadow: 1px 1px 1px #000; }
	.modal-confirm {		
		color: #636363;
		width: 325px;
	}
	.modal-confirm .modal-content {
		padding: 20px;
		border-radius: 5px;
		border: none;
	}
	.modal-confirm .modal-header {
		border-bottom: none;   
        position: relative;
	}
	.modal-confirm h4 {
		text-align: center;
		font-size: 26px;
		margin: 30px 0 -15px;
	}
	.modal-confirm .form-control, .modal-confirm .btn {
		min-height: 40px;
		border-radius: 3px; 
	}
	.modal-confirm .close {
        position: absolute;
		top: -5px;
		right: -5px;
	}	
	.modal-confirm .modal-footer {
		border: none;
		text-align: center;
		border-radius: 5px;
		font-size: 13px;
	}	
	.modal-confirm .icon-box {
		color: #fff;		
		position: absolute;
		margin: 0 auto;
		left: 0;
		right: 0;
		top: -70px;
		width: 95px;
		height: 95px;
		border-radius: 50%;
		z-index: 9;
		background: #82ce34;
		padding: 15px;
		text-align: center;
		box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.1);
	}
	.modal-confirm .icon-box i {
		font-size: 58px;
		position: relative;
		top: 3px;
	}
	.modal-confirm.modal-dialog {
		margin-top: 80px;
	}
    .modal-confirm .btn {
        color: #fff;
        border-radius: 4px;
		background: #82ce34;
		text-decoration: none;
		transition: all 0.4s;
        line-height: normal;
        border: none;
    }
	.modal-confirm .btn:hover, .modal-confirm .btn:focus {
		background: #6fb32b;
		outline: none;
	}
	.trigger-btn {
		display: inline-block;
		margin: 100px auto;
	}
</style>



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
      
      <li><a href="Party_list.jsp">Party List</a></li>
      <li><a  class="current"  href="generate_token.jsp">Apply for Vote</a></li>
      <li></li>
      <li class="last"><a href="Logout.jsp">Logout</a></li>
    </ul>
  </div>
</div>
        
        
        
        
        
      
        
        
        
        <div class="wrap">
  <div id="main">
    <div class="wrap">
        <h1>HELLO :  &nbsp&nbsp&nbsp  <%= session.getAttribute("name").toString().toUpperCase()  %> </h1>
     
       <div class="line"></div>
       <br>
       <h4> Get token Number to caste your vote through Digital Voting System.<br>
            By clicking on the link given below :- </h4>
      </div>
       
   <div class="line"></div>
   <h4> <a href="#myModal" class="trigger-btn" data-toggle="modal">Get your Token Number</a></h4>
</div>
                  
 
                  
   <div id="side">
       <img src="images/ecicall.jpg" />
   </div>
   <div id="footer">
 
      <div class="r"><h5 class="title">© Election Commission of India. All rights reserved </h5></div>
      </div>
</div>
        <%
           String voter_id= session.getAttribute("voter_id").toString();
         %>
  
    <div id="myModal" class="modal fade">    
     <div class="modal-dialog modal-confirm">   
        <div class="modal-content">
	    <div class="modal-header">
		<div class="icon-box">
		    <i class="material-icons">&#xE876;</i>
		</div>				
	        <h4 class="modal-title">Token Generated</h4>	
	    </div>
	  <div class="modal-body">
          <%
             try{
            String sql="select * from voting_time where voter_id='"+
                  voter_id+"'";
            DBconnect db=new DBconnect();
            ResultSet rs=db.queryReturner(sql);
            if(rs.next())
            {
                String token=rs.getString("token_no");
                out.print("<h3 class=text-center>Your Token Number is: "+token+"</h3>");
            }
           
            
            }
            catch(Exception ex)
            {
                out.print(ex);
            }
             %>
	</div>
      <div class="modal-footer">
     <button class="btn btn-success btn-block" data-dismiss="modal">OK</button>
    </div>
   </div>
     </div>
    </div>    
 </body>
</html>
