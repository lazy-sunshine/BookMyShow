<%-- 
    Document   : new
    Created on : Jan 15, 2015, 8:40:35 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<style type="text/css">
<!--
body {
	font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
	background-color: #4E5869;
	margin: 0;
	padding: 0;
	color: #000;
	background-image: url(bkgd.jpg);
}

/* ~~ Element/tag selectors ~~ */
ul, ol, dl { /* Due to variations between browsers, it's best practices to zero padding and margin on lists. For consistency, you can either specify the amounts you want here, or on the list items (LI, DT, DD) they contain. Remember that what you do here will cascade to the .nav list unless you write a more specific selector. */
	padding: 0;
	margin: 0;
}
h1, h2, h3, h4, h5, p {
	margin-top: 0;	 /* removing the top margin gets around an issue where margins can escape from their containing div. The remaining bottom margin will hold it away from any elements that follow. */
	padding-right: 15px;
	padding-left: 15px; /* adding the padding to the sides of the elements within the divs, instead of the divs themselves, gets rid of any box model math. A nested div with side padding can also be used as an alternate method. */
}
h6 {
    color:#F00;
    margin-top: 0;	 /* removing the top margin gets around an issue where margins can escape from their containing div. The remaining bottom margin will hold it away from any elements that follow. */
	padding-right: 15px;
	padding-left: 15px;
}
a img { /* this selector removes the default blue border displayed in some browsers around an image when it is surrounded by a link */
	border: none;
}

/* ~~ Styling for your site's links must remain in this order - including the group of selectors that create the hover effect. ~~ */
a:link {
	color:#414958;
	text-decoration: underline; /* unless you style your links to look extremely unique, it's best to provide underlines for quick visual identification */
}
a:visited {
	color: #4E5869;
	text-decoration: underline;
}
a:hover, a:active, a:focus { /* this group of selectors will give a keyboard navigator the same hover experience as the person using a mouse. */
	text-decoration: none;
}

/* ~~ this container surrounds all other divs giving them their percentage-based width ~~ */
.container {
	width: 80%;
	max-width: 1260px;/* a max-width may be desirable to keep this layout from getting too wide on a large monitor. This keeps line length more readable. IE6 does not respect this declaration. */
	min-width: 780px;/* a min-width may be desirable to keep this layout from getting too narrow. This keeps line length more readable in the side columns. IE6 does not respect this declaration. */
	background-color: #FFF;
	margin: 0 auto; /* the auto value on the sides, coupled with the width, centers the layout. It is not needed if you set the .container's width to 100%. */
}

/* ~~the header is not given a width. It will extend the full width of your layout. It contains an image placeholder that should be replaced with your own linked logo~~ */
.header {
	background-color: #FF3399;
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
	font-size: 30px;
}

/* ~~ This is the layout information. ~~ 

1) Padding is only placed on the top and/or bottom of the div. The elements within this div have padding on their sides. This saves you from any "box model math". Keep in mind, if you add any side padding or border to the div itself, it will be added to the width you define to create the *total* width. You may also choose to remove the padding on the element in the div and place a second div within it with no width and the padding necessary for your design.

*/
.content {
	padding: 10px 0;
	background-color: #CCC;
}

/* ~~ This grouped selector gives the lists in the .content area space ~~ */
.content ul, .content ol { 
	padding: 0 15px 15px 40px; /* this padding mirrors the right padding in the headings and paragraph rule above. Padding was placed on the bottom for space between other elements on the lists and on the left to create the indention. These may be adjusted as you wish. */
}

/* ~~ The footer ~~ */
.footer {
	padding: 10px 0;
	background-color: #6F7D94;
}

/* ~~ miscellaneous float/clear classes ~~ */
.fltrt {  /* this class can be used to float an element right in your page. The floated element must precede the element it should be next to on the page. */
	float: right;
	margin-left: 8px;
}
.fltlft { /* this class can be used to float an element left in your page. The floated element must precede the element it should be next to on the page. */
	float: left;
	margin-right: 8px;
}
.clearfloat { /* this class can be placed on a <br /> or empty div as the final element following the last floated div (within the #container) if the #footer is removed or taken out of the #container */
	clear:both;
	height:0;
	font-size: 1px;
	line-height: 0px;
}
.high {
	font-weight: bold;
	color: #00F;
	background-color: #FF0;
}
-->
</style>
<link href="SpryAssets/SpryValidationPassword.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryValidationTextField.css" rel="stylesheet" type="text/css" />
<script src="SpryAssets/SpryValidationPassword.js" type="text/javascript"></script>
<script src="SpryAssets/SpryValidationTextField.js" type="text/javascript"></script>
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
  <div class="header" align="center">USER REGISTRATION INFORMATION<!-- end .header --></div>
  <div class="content">
      <form action="login" method="post">
    <table width="653" height="166" border="1" align ="center">
      <tr>
        <td width="95">USERNAME        </td>
        <td width="542"><form id="form1" name="form1" method="post" action="">
          <label for="user_login"></label>
          <span id="sprytextfield1">
          <label for="login_name"></label>
          <input type="text" name="login_name" id="login_name" />
          <span class="textfieldRequiredMsg">A value is required.</span></span>
        </form></td>
      </tr>
      <tr>
        <td height="94">PASSWORD</td>
        <td>
          <span id="sprypassword1">
          <label for="login_pass"></label>
          <input type="password" name="login_pass" id="login_pass" />
          <span class="passwordRequiredMsg">A value is required.</span><span class="passwordMinCharsMsg">Minimum number of characters not met.</span><span class="passwordMaxCharsMsg">Exceeded maximum number of characters.</span></span>
        </td>
      </tr>
    </table>
    <h1 align="center"> 
      <input type="submit" name="login_buttton" id="login_buttton" value="submit1" />
    </h1> <br> </br>
        <h1>For your details click here</h1>
          <h1 align="center"> 
              <input type="submit" name="login_buttton" id="login_buttton1" value="submit" /></h1>
  </form>
      
      <p> ***** On Entering wrong username or password you will be redirected to this page</p>
   
    <p >&nbsp;</p>
    <p >&nbsp;</p>
    <p >&nbsp;</p>
    <p>&nbsp;</p>
  <!-- end .content --></div>
  <div class="footer">
    <p class="high">This Site Belongs To Book My Show.</p>
    <!-- end .footer --></div>
<!-- end .container --></div>
<script type="text/javascript">
var sprypassword1 = new Spry.Widget.ValidationPassword("sprypassword1", {validateOn:["blur"], minChars:1, maxChars:45});
var sprytextfield1 = new Spry.Widget.ValidationTextField("sprytextfield1", "none", {validateOn:["blur"]});
</script>
</body>
</html>

