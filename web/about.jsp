<%-- 
    Document   : about
    Created on : Jan 15, 2015, 6:36:04 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link href="about.html" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<style type="text/css">
body,td,th {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 125%;
	color: #FFFFFF;
}
body {
	background-color: #666666;
	background-image: url(bkgd.jpg);
}
a:link {
	color: #00FF00;
	text-decoration: underline;
}
a:visited {
	color: #009900;
	text-decoration: underline;
}
a:hover {
	color: #00CC00;
	text-decoration: underline;
}
a:active {
	color: #FF0000;
	text-decoration: underline;
}
#apDiv1 {
	position: absolute;
	left: 205px;
	top: 529px;
	width: 714px;
	height: 415px;
	z-index: 1;
}
.high {
	font-weight: bold;
	color: #00F;
	background-color: #FF0;
}
</style>
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
%>
<body>
<div id="apDiv1">
  <p>&nbsp;</p>
  <p>BOOK my show is the enterprise of  Rainbow Entertainment. It provides online as well as offline ticket  facility.Roger Inc is the head of this enterprise. This site enable people to  check the availability of show tickets and book their tickets online through e-commerce,  this system enable both registered user as well as guest user to book tickets  for movie show for 7 days, they can also enquire their seats through internet .The  site will use banners to display the promotional scheme .This site will categorize  movie on the basis of action, thriller and comedy. The system will track the  registered user and display customized banner.</p>
  <p>&nbsp;</p>
  <p>Follow us on : <a href="www.twitter.com"> bookmyshow.twitter.com</a> or </p>
  <p>Facebook page : <a href="www.twitter.com"> bookmyshow </a></p>
</div>
<div class="container">
  <div class="header"><img src="about.jpg" width="1079" height="454" /><!-- end .header --></div>
  
    <ul id="MenuBar1" class="MenuBarHorizontal">
      <li><a class="MenuBarItemSubmenu" href="#">Login</a>
        <ul>
          <li><a href="register.jsp">New User</a></li>
          <li><a href="new.jsp">Registered User</a></li>
</ul>
      </li>
      <li><a href="#" class="MenuBarItemSubmenu">Movie</a>
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
      <li><a href="contact.jsp">Contact</a>    </li>
    </ul>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
  <p>&nbsp;    </p>
<h1>&nbsp;</h1>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p><!-- end .content --></p>
</div>
  <div class="footer">
    <p class="high">This Site Belongs To Book My Show.</p>
<!-- end .footer --></div>
  <!-- end .container --></div>

<script type="text/javascript">
var MenuBar1 = new Spry.Widget.MenuBar("MenuBar1", {imgDown:"SpryAssets/SpryMenuBarDownHover.gif", imgRight:"SpryAssets/SpryMenuBarRightHover.gif"});
  </script>
</body>
</html>

