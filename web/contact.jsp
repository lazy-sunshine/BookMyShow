<%-- 
    Document   : contact
    Created on : Jan 15, 2015, 9:10:38 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link href="contact_new.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryValidationTextField.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryValidationTextarea.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<script src="SpryAssets/SpryValidationTextField.js" type="text/javascript"></script>
<script src="SpryAssets/SpryValidationTextarea.js" type="text/javascript"></script>
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
  <div class="header"><marquee direction="right"><img src="contact.jpg" width="1485" height="426" /></marquee><!-- end .header --></div>
  <div class="content">
    <ul id="MenuBar1" class="MenuBarHorizontal">
      <li><a class="MenuBarItemSubmenu" href="#">LOGIN</a>
        <ul>
          <li><a href="register.jsp">New User</a></li>
          <li><a href="new.jsp">Registered User</a></li>
</ul>
      </li>
      <li><a href="#" class="MenuBarItemSubmenu">Movies</a>
        <ul>
          <li><a href="current_movie.jsp">Current Movie</a></li>
          <li><a href="movie_time.jsp">Movie TimeTable</a></li>
        </ul>
      </li>
      <li><a class="MenuBarItemSubmenu" href="#">Book Ticket</a>
        <ul>
          <li><a href="current_movie.jsp">Current Movie</a>          </li>
          <li><a href="movie_time.jsp">Movie In The Week</a></li>
</ul>
      </li>
      <li><a href="benefit.jsp">Offers</a></li>
      <li><a href="about.jsp">About Us</a></li>
      <li><a href="contact.jsp">Contact Us</a></li>
    </ul>
    <p>&nbsp;</p>
    <p>We appreciate your effort to contact us ,please provide us your feedback and we will contact you as soon as possible.</p>
    <form action="contact" method="post">
    <table width="702" height="274" border="1" align="center">
      <tr>
        <td width="140" height="78">NAME</td>
        <td width="450"><span id="sprytextfield1">
        <label for="con_name"></label>
        <span class="textfieldRequiredMsg">A value is required.</span><span class="textfieldMinCharsMsg">Minimum number of characters not met</span></span> <span id="sprytextfield3">
        <label for="con_name2"></label>
        <input type="text" name="con_name" id="con_name2" />
        <span class="textfieldRequiredMsg">A value is required.</span><span class="textfieldMinCharsMsg">Minimum number of characters not met.</span><span class="textfieldMaxCharsMsg">Exceeded maximum number of characters.</span></span></td>
      </tr>
      <tr>
        <td>EMAIL</td>
        <td>
        <label for="con_email"></label>
        <input type="text" name="con_email" id="con_email" />
        <span class="textfieldRequiredMsg">A value is required.</span><span class="textfieldInvalidFormatMsg">Invalid format.</span></td>
      </tr>
      <tr>
        <td>FEEDBACK</td>
        <td>
          <label for="con_feedback"></label>
          <textarea name="con_feedback" id="con_feedback" cols="45" rows="5"></textarea>
        <span class="textareaRequiredMsg">A value is required.</span></td>
      </tr>
    </table>
    <br> <br>
            <input type="submit" value="submit"></input> 
            </form>
    <h1>&nbsp;</h1>
  <!-- end .content --></div>
  <div class="footer"><!-- end .footer --></div>
  <span class="high">  This Site Belongs To Boook My Show.</span></div>
<script type="text/javascript">
var sprytextfield1 = new Spry.Widget.ValidationTextField("sprytextfield1", "none", {minChars:1, maxChars:100});
var sprytextfield2 = new Spry.Widget.ValidationTextField("sprytextfield2", "email", {validateOn:["blur"]});

var sprytextfield3 = new Spry.Widget.ValidationTextField("sprytextfield3", "none", {validateOn:["blur"], minChars:1, maxChars:100});
var MenuBar1 = new Spry.Widget.MenuBar("MenuBar1", {imgDown:"SpryAssets/SpryMenuBarDownHover.gif", imgRight:"SpryAssets/SpryMenuBarRightHover.gif"});
</script>
</body>
</html>

