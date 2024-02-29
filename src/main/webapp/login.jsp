<%@page import="java.util.List"%>
<%@page import="com.example.common.ErrorUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="icon" href="Rimages\loginfavicon.png">
</head>
<style media="screen">
      *,
*:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body{
    background-color: #080710;
}
.background{
    width: 430px;
    height: 520px;
    position: absolute;
    transform: translate(-50%,-50%);
    left: 50%;
    top: 50%;
}
.background .shape{
    height: 200px;
    width: 200px;
    position: absolute;
    border-radius: 50%;
}
.shape:first-child{
    background: linear-gradient(
        #1845ad,
        #23a2f6
    );
    left: -80px;
    top: -80px;
}
.shape:last-child{
    background: linear-gradient(
        to right,
        #ff512f,
        #f09819
    );
    right: -30px;
    bottom: -80px;
}
form{
    height: 520px;
    width: 400px;
    background-color: rgba(255,255,255,0.13);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 50%;
    left: 50%;
    border-radius: 10px;
    backdrop-filter: blur(10px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 50px 35px;
}
form *{
    font-family: 'Poppins',sans-serif;
    color: #ffffff;
    letter-spacing: 0.5px;
    outline: none;
    border: none;
}
form h3{
    font-size: 32px;
    font-weight: 500;
    line-height: 30px;
    text-align: center;
}

label{
    display: block;
    margin-top: 30px;
    font-size: 16px;
    font-weight: 500;
}
input{
    display: block;
    height: 50px;
    width: 100%;
    background-color: rgba(255,255,255,0.07);
    border-radius: 3px;
    padding: 0 10px;
    margin-top: 8px;
    font-size: 20px;
    font-weight: 300;
}
::placeholder{
    color: #e5e5e5;
    font-size: 15px;
}
button{
    margin-top: 50px;
    width: 100%;
    background-color: #ffffff;
    color: #080710;
    padding: 15px 0;
    font-size: 18px;
    font-weight: 600;
    border-radius: 5px;
    cursor: pointer;
}
button:hover{
text-transform: uppercase;
}
.social{
  margin-top: 30px;
  display: flex;
}
.social div{
  background: red;
  width: 150px;
  border-radius: 3px;
  padding: 5px 10px 10px 5px;
  background-color: rgba(255,255,255,0.27);
  color: #eaf0fb;
  text-align: center;
}
.social div:hover{
  background-color: rgba(255,255,255,0.47);
}
.social .fb{
  margin-left: 25px;
}
.social i{
  margin-right: 4px;
}
a{
text-decoration: none;
}
a:hover{
text-transform: uppercase;
font-size: 20px;
}
.error-message{
color:white;
font-size:25px;
font-weight:500;
text-align: center;
margin-top:19px;
}

 </style>

<body>
<div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
 
    <form action = "loginservlet" method="post">
    
     <%-- <% ErrorUtil errorUtil = (ErrorUtil) request.getAttribute("errorUtil");%>
    <% if (errorUtil != null && !errorUtil.getErrorMessages().isEmpty()) {%>
    <div class="error messages">
        <ul>
            <% for (String errorMessage : errorUtil.getErrorMessages()) {%>
            <li><%= errorMessage%>
            </li>
            <% } %>
        </ul>
    </div>
    <% } %>
    <%ErrorUtil errorUtil1 = (ErrorUtil) request.getAttribute("InvalidError");%>
    <%if (errorUtil1 != null) {%>
    <%List<String> message = errorUtil1.getErrorMessages();%>
    <div class="error-message">
        <%=message%>
    </div>
    <% } %> --%>
        <h3>Login Here</h3>
			
			    <% ErrorUtil errorUtil1 = (ErrorUtil) request.getAttribute("InvalidError"); %>
				<% if (errorUtil1 != null && errorUtil1.containsErrorMessage("Invalid Credentials!!")) { %>
    			<div class="error-message">
       					 Invalid Credentials!!!
   				 </div>
							<% } %>


        <label for="username">Username</label>
        <input type="text" placeholder="Email" id="username" name= "email">

        <label for="password">Password</label>
        <input type="password" placeholder="Password" id="password" name ="pass">

        <button> Log In </button>
        <label for="password">Don't Have Account?  <a href = "Register.jsp">  Register  </a></label>
    	
    </form>
</body>
</html>