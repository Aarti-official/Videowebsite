<%@page import="com.example.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
<link rel="icon" href="Rimages\vidfavicon.png">
<link rel="stylesheet" href="style.css">
</head>
		<body>
	<%
		String name = ((User) session.getAttribute("CurrentUser")).getName();
	%>
		<h2></h2>

		 <div class="Section_top">
        <div class="content">
            <h1>welcome  <%=name %></h1>
            <a href="#">Profile</a>
        </div>
    </div>
 
     <div class = "video">
     
     <video controls>
        <source src="Rimages/video.mp4" type="video/mp4">
    </video>
     
     <video controls>
        <source src="Rimages/vid3.mp4" type="video/mp4">
    </video>
     
      <video controls>
        <source src="Rimages/vid4.mp4" type="video/mp4">
    </video>
    
     <video controls>
        <source src="Rimages/vid5.mp4" type="video/mp4">
    </video>
    
     <video controls>
        <source src="Rimages/vid6.mp4" type="video/mp4">
    </video>
    
     <video controls>
        <source src="Rimages/vid7.mp4" type="video/mp4">
    </video>
    
     <video controls>
        <source src="Rimages/vid2.mp4" type="video/mp4">
    </video>
    
     <video controls>
        <source src="Rimages/vid8.mp4" type="video/mp4">
    </video>
    
    
    
    
     </div>
    

</body>
</html>