<%-- 
    Document   : register
    Created on : Jan 12, 2015, 2:14:06 PM
    Author     : User
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link href="one.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryValidationTextField.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryValidationRadio.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryValidationPassword.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryValidationConfirm.css" rel="stylesheet" type="text/css" />
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
<script src="SpryAssets/SpryValidationTextField.js" type="text/javascript"></script>
<script src="SpryAssets/SpryValidationRadio.js" type="text/javascript"></script>
<script src="SpryAssets/SpryValidationPassword.js" type="text/javascript"></script>
<script src="SpryAssets/SpryValidationConfirm.js" type="text/javascript"></script>
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
  <div class="header"><marquee direction ="left"><img src="login.jpg" width="1443" height="428" /></marquee><!-- end .header --></div>
  <div class="content">
    <ul id="MenuBar1" class="MenuBarHorizontal">
      <li><a class="MenuBarItemSubmenu" href="#">Login</a>
        <ul>
          <li><a href="register.jsp">Registered User</a></li>
          <li><a href="new.jsp">New User</a></li>
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
          <li><a href="movie_time.jsp">Movie in the week</a></li>
</ul>
      </li>
      <li><a href="benefit.jsp">Offers</a></li>
      <li><a href="about.jsp">About Us</a></li>
      <li><a href="contact.jsp">Contact Us</a></li>
    </ul>
    <h1>&nbsp;</h1>
    <h2>&nbsp;</h2>
    <p> We appreciate your Efforts to Connect with us.Register Yourself to bag great offers from us.    </p>
    <form action ="register" method="post">
    <table align="center" width="819" height="308" border="1">
      <tr>
        <td width="296">NAME   </td>
        <td width="334"><span id="sprytextfield1">
          <label for="name9"></label>
        </span><span id="sprytextfield2">
        <label for="name10"></label>
        <span class="textfieldRequiredMsg">A value is required.</span><span class="textfieldMinCharsMsg">Minimum number of characters </span></span><span id="sprytextfield7">
        <label for="name11"></label>
        <input type="text" name="name" id="name11" />
        <span class="textfieldRequiredMsg">A value is required.</span><span class="textfieldMinCharsMsg">Minimum number of characters not met.</span><span class="textfieldMaxCharsMsg">Exceeded maximum number of characters.</span></span></td>
      </tr>
      <tr>
        <td>PASSWORD</td>
        <td><span id="sprytextfield3">
        <label for="pass"></label>
        <span class="textfieldRequiredMsg">A value is req</span><span class="textfieldMaxCharsMsg">xceeded maximu</span></span><span id="sprypassword1">
        <label for="pass"></label>
        <input type="password" name="pass" id="pass" />
        <span class="passwordRequiredMsg">A value is required.</span><span class="passwordMinCharsMsg">Minimum number of characters not met.</span><span class="passwordMaxCharsMsg">Exceeded maximum number of characters.</span></span></td>
      </tr>
      <tr>
        <td>REPEAT PASSWORD</td>
        <td><span id="spryconfirm1">
          <label for="pass1"></label>
          <input type="password" name="pass1" id="pass1" />
        <span class="confirmRequiredMsg">A value is required.</span><span class="confirmInvalidMsg">The values don't match.</span></span></td>
      </tr>
      <tr>
        <td>EMAIL iD</td>
        <td><span id="sprytextfield4">
        <label for="email"></label>
        <span class="textfieldRequiredMsg">A value is required.</span><span class="textfieldInvalidFormatMsg">Invalid format.</span></span><span id="sprytextfield6">
        <label for="email"></label>
        <input type="text" name="email" id="email" />
        <span class="textfieldRequiredMsg">A value is required.</span><span class="textfieldInvalidFormatMsg">Invalid format.</span></span></td>
      </tr>
      <tr>
        <td>PHONE NO.</td>
        <td>
        <input type="text" name="phone" id="phone" />
        </td>
      </tr>
      <tr>
        <td>GENDER</td>
        <td><span id="spryradio1">
          <label>
            <input type="radio" name="RadioGroup1" value="male" id="RadioGroup1_0" />
            MALE</label>
          <br />
          <label>
            <input type="radio" name="RadioGroup1" value="female" id="RadioGroup1_1" />
            FEMALE</label>
          <br />
        <span class="radioRequiredMsg">Please make a selection.</span></span></td>
      </tr>
    </table>
    
    <p>&nbsp;</p>
    <p>
      <input type="submit" name="submit" id="submit" value="Submit" />
    </p>
    </form>
   
  </div>
  <div class="footer">
    <p class="high">This Site is belongs to book My Show.</p>
  <!-- end .footer --></div>
  <!-- end .container --></div>
<script type="text/javascript">
var MenuBar1 = new Spry.Widget.MenuBar("MenuBar1", {imgDown:"SpryAssets/SpryMenuBarDownHover.gif", imgRight:"SpryAssets/SpryMenuBarRightHover.gif"});
var sprytextfield1 = new Spry.Widget.ValidationTextField("sprytextfield1");
var sprytextfield2 = new Spry.Widget.ValidationTextField("sprytextfield2", "none", {hint:"name", minChars:1, maxChars:100});
var sprytextfield3 = new Spry.Widget.ValidationTextField("sprytextfield3", "none", {minChars:1, maxChars:100});
var sprytextfield4 = new Spry.Widget.ValidationTextField("sprytextfield4", "email", {hint:"email"});
var sprytextfield5 = new Spry.Widget.ValidationTextField("sprytextfield5", "phone_number");
var spryradio1 = new Spry.Widget.ValidationRadio("spryradio1");
var sprytextfield7 = new Spry.Widget.ValidationTextField("sprytextfield7", "none", {validateOn:["blur"], minChars:1, maxChars:100, hint:"name"});
var sprypassword1 = new Spry.Widget.ValidationPassword("sprypassword1", {validateOn:["blur"], minChars:1, maxChars:100});
var sprytextfield6 = new Spry.Widget.ValidationTextField("sprytextfield6", "email", {validateOn:["blur"]});
var sprytextfield8 = new Spry.Widget.ValidationTextField("sprytextfield8", "phone_number", {validateOn:["blur"]});
var spryconfirm1 = new Spry.Widget.ValidationConfirm("spryconfirm1", "pass", {validateOn:["blur"]});
</script>
</body>
</html>

