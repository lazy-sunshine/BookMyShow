<%-- 
    Document   : benefit
    Created on : Jan 15, 2015, 8:38:57 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link href="offer.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
</head>
    <% Cookie []cookies=request.getCookies();
String user=null;
 if(cookies !=null){
     for(int i=0;i<cookies.length;i++){
         Cookie cookie=cookies[i];
         if(cookie.getName().equals("username"))
              user =cookie.getValue();
           if(user !=null){
          out.println("Welcome   " +user);
                 }
                 else out.println("Welcome   " );
                 }
 }
%>

<body>


<div class="container">
  <div class="header"><marquee direction="left">
    <img src="gift-card-banner-02.jpg" width="972" height="320" />
  </marquee>
  </div>
  <div class="content">
  
    
    <ul id="MenuBar1" class="MenuBarHorizontal">
      <li><a class="MenuBarItemSubmenu" href="#">LOGIN</a>
        <ul>
          <li><a href="new.jsp">New User</a></li>
          <li><a href="register.jsp">Registered User</a></li>
</ul>
      </li>
      <li><a class="MenuBarItemSubmenu" href="#">Movies</a>
              <ul>
          <li><a href="current_movie.jsp">Current Movie</a></li>
          <li><a href="movie_time.jsp">Movie TimeTable</a></li>
        </ul>
      </li>
      <li><a class="MenuBarItemSubmenu" href="#">Book Ticket</a>
        <ul>
          <li><a href="current_movie.jsp">Current Movie</a>          </li>
          <li><a href="movie_time.jsp">Movie in the Week</a></li>
</ul>
      </li>
      <li><a href="benefit.jsp">Offers</a></li>
      <li><a href="about.jsp">About Us</a></li>
      <li><a href="contact.jsp">ContactUs</a></li>
    </ul>
    <br> <br>
    <h1><img src="visa-banner.jpg" width="710" height="250" /> <img src="heads-up.jpg" width="314" height="245" /></h1>
    <h2><img src="bookmyshow-snapdeal-offer-01.jpg" width="836" height="159" /></h2>
    <p><img src="bms-gift-card-promotion-01.jpg" width="960" height="125" /></p>
    <p>&nbsp;</p>
    <p>
    </p><h1>
  Special Offer for each of these special moments of yours....</h1>
      <p><img src="1001165.jpg" width="288" height="182" alt="anniversary" /> <img src="1001167.jpg" width="288" height="182" /> <img src="1001227.jpg" width="288" height="182" /> <br> <img src="1001164.jpg" width="288" height="182" /> <img src="1001162.jpg" width="288" height="182" /></p>
  <!-- end .content --></div>
  <div class="footer">
    <p class="high">This Site Belongs To Book My Show.</p>
    <!-- end .footer --></div>
  <!-- end .container --></div>
<script type="text/javascript">
var MenuBar1 = new Spry.Widget.MenuBar("MenuBar1", {imgDown:"SpryAssets/SpryMenuBarDownHover.gif", imgRight:"SpryAssets/SpryMenuBarRightHover.gif"});
</script>
</body>
</html>

