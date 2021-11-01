<%-- 
    Document   : Voter_login
    Created on : 13 Mar, 2019, 10:54:37 PM
    Author     : MY PC
--%>
<%@ page import="java.sql.*" %> 
<%@ page import="Upyogi.DBconnect" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<title>Voter Login</title>
	<!-- Meta-Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <meta name="keywords" content="Exact login Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <!-- //Meta-Tags -->

	<!-- Custom Theme files -->
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css/font-awesome.css" rel="stylesheet"> <!-- Font-Awesome-Icons-CSS -->
	<!-- //Custom Theme files -->
	
	<!-- web font --> 
	<link href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext" rel="stylesheet">
	<!-- //web font --> 
	
</head>
    <body>
        <div class="main">
            <h1 style="color: black">Voter Login Form</h1>
		<div class="main-w3lsrow">
			<!-- login form -->
			<div class="login-form login-form-left"> 
				<div class="agile-row">
					<div class="head">
						<h2>Login Here....</h2>
						
					</div>					
					<div class="clear"></div>
					<div class="login-agileits-top">
        <form action="./Validate_Voter" method="post">
      
            
            <input type="text" class="name" name="t1" Placeholder="Voter Id Number" required=""/>
	    <input type="password" class="password" name="t2" Placeholder="Password" required=""/>
	    <input type="submit" value="Login" name="b1" > 
         </form></div> 
					<div class="login-agileits-bottom"> 
						<h6><a href="Voter_reg.jsp">New Voter Registration</a></h6>
					</div> 

				</div>  
			</div>  
		</div>
		<!-- //login form -->
		
		<div class="login-agileits-bottom1"> 
			<h3>Right to Vote</h3>
		</div>
		
		<!-- social icons -->
		
		<!-- //social icons -->
		
		<!-- copyright -->
		<div class="copyright">
			<p> © Election Commission of India. All rights reserved </p>
		</div>
		<!-- //copyright --> 
	</div>	
        
    </body>
</html>
