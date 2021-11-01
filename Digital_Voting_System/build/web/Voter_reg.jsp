<%-- 
    Document   : Voter_reg
    Created on : 10 Mar, 2019, 4:00:43 PM
    Author     : MY PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	<title>Voter Registration</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content="Full Screen Enroll Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- Meta tag Keywords -->

	<!-- css files -->
	<link rel="stylesheet" href="css1/style.css" type="text/css" media="all" />
	<!-- Style-CSS -->
	<link rel="stylesheet" href="css1/font-awesome.min.css">
	<!-- Font-Awesome-Icons-CSS -->
	<!-- //css files -->

	<!-- web-fonts -->
	<link href="//fonts1.googleapis.com/css1?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=devanagari,latin-ext"
	 rel="stylesheet">
	<!-- //web-fonts -->
</head>
    <body>
        <div class="main-w3ls">
		<div class="left-content">
			<div class="w3ls-content">
				<!-- logo -->
				<img src="images/logo.png" />
				<!-- //logo -->
				<h2 style="color: black"> " वोट हमारा है अधिकार, करें नहीं इसको बेकार...!! "</h2>
                                       
				
				
			</div>
			<!-- copyright -->
			
			
		</div>
		<div class="right-form-agile">
			<!-- content -->
			<div class="sub-main-w3">
				<h3>Register Here...!!</h3>
                                <br> 
                           <form action="./Reg_Submit" method="post">
					<div class="form-style-agile">
						<label>Your Name</label>
						<div class="pom-agile">
							<span class="fa fa-user"></span>
							<input placeholder="Your Name"  type="text" name="t1" value="" required autofocus=""
                                               pattern="[a-zA-Z]{2,50}">
						</div>
					</div>
					<div class="form-style-agile">
						<label>Adhaar Number</label>
                                                
						<div class="pom-agile">
							<span class="fa fa-user-secret"></span>
							<input placeholder="Adhaar Number"  type="text" name="t2" value="" required pattern="[0-9]{12}" >
						</div>
					</div>
                                       <div class="form-style-agile">
						<label>Voter Id</label>
						<div class="pom-agile">
							<span class="fa fa-text-height"></span>
							<input placeholder="Voter Id"  type="text" name="t3" value="" required="" >
						</div>
					</div>
                                      <div class="form-style-agile">
						<label>Mobile Number</label>
						<div class="pom-agile">
							<span class="fa fa-whatsapp"></span>
							<input placeholder="Mobile Number" type="text" name="t4" value="" required
                                               pattern="[0-9]{10}" >
						</div>
					</div>
                               <div class="form-style-agile">
						<label>Date of Birth</label>
						<div class="pom-agile">
							<span class="fa fa-calendar"></span>
							<input type="date"  name="t5" data-date-inline-picker="true"  >
						</div>
					</div>
                               
                               
                                <div class="form-style-agile">
						<label>State</label>
						<div class="pom-agile">
							<span class="fa fa-map-marker"></span>
							<select name="t8">
                                    <option>Andhra Pradesh</option>
                                    <option>Arunachal Pradesh</option>
                                    <option>Assam</option>
                                    <option>Bihar</option>
                                    <option>Chhattisgarh</option>
                                    <option>Delhi</option>
                                    <option>Goa</option>
                                    <option>Gujarat</option>
                                    <option>Haryana</option>
                                    <option>Himachal Pradesh</option>
                                    <option>Jammu and Kashmir</option>
                                    <option>Jharkhand</option>
                                    <option>Karnataka</option>
                                    <option>Kerala</option>
                                    <option>Madhya Pradesh</option>
                                    <option>Maharashtra</option>
                                    <option>Manipur</option>
                                    <option>Meghalaya</option>
                                    <option>Mizoram</option>
                                    <option>Nagaland</option>
                                    <option>Odisha</option>
                                    <option>Punjab</option>
                                    <option>Rajasthan</option>
                                    <option>Sikkim</option>
                                    <option>Tamil Nadu</option>
                                    <option>Telangana</option>
                                    <option>Tripura</option>
                                    <option>Uttar Pradesh</option>
                                    <option>Uttarakhand</option>
                                    <option>West Bengal</option>
                                    
                                        </select>
						</div>
					</div>
                               
                                <div class="form-style-agile">
						<label>District</label>
						<div class="pom-agile">
							<span class="fa fa-map-pin"></span>
							<input placeholder="District"  type="text" name="t9" value="" required>
						</div>
					</div>
                               
					<div class="form-style-agile">
						<label>Create Password</label>
						<div class="pom-agile">
							<span class="fa fa-key"></span>
                                                        <input placeholder="Create Password" type="password" name="t6" value="" required>
						</div>
					</div>
					<div class="form-style-agile">
						<label>Confirm Password</label>
						<div class="pom-agile">
							<span class="fa fa-lock"></span>
							<input placeholder="Confirm Password" name="t7" type="password" value="" required>
						</div>
					</div>
					<div class="sub-agile">
						<input type="checkbox" id="brand1" value="">
						<label for="brand1">
							<span></span>Above details are true as per my knowledge</label>
					</div>
					<input type="submit" value="Submit" name="b1" >
				</form>  
                                <br>
                                <a href="Voter_login.jsp" style="color: white"><span></span>Already Registered Click Here</a>	
					</div>
                                <br>
                            <p> © Election Commission of India. All rights reserved 
				</p>
			</div>
                        
		</div>
	</div>
	<!-- //content -->
    </body>
</html>
