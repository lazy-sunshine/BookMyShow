 <%@page import="java.util.logging.Logger"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.logging.Level"%>
<%-- 
    Document   : movie_time
    Created on : Jan 17, 2015, 1:23:26 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link href="oneColLiqCtrHdr.css" rel="stylesheet" type="text/css" />
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
<%   
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       


        Connection con = DriverManager.getConnection("jdbc:odbc:HR", "sa", "123456");

 String t=null;
            PreparedStatement st = con.prepareStatement("select m_name from movie_test_1");
            
            ResultSet result=st.executeQuery();
            while(result.next()){
                 t=result.getString(1);
            }
          
   %>
   <%
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       


        Connection con1 = DriverManager.getConnection("jdbc:odbc:HR", "sa", "123456");
   String k=null;
            PreparedStatement st1 = con1.prepareStatement("select m_name from movie_test_2");
            
            ResultSet result1=st1.executeQuery();
            while(result1.next()){
                 k=result1.getString(1);
            }
   %>
    <%
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       


        Connection con2 = DriverManager.getConnection("jdbc:odbc:HR", "sa", "123456");
   String p=null;
            PreparedStatement st2 = con2.prepareStatement("select m_name from movie_test_3");
            
            ResultSet result2=st2.executeQuery();
            while(result2.next()){
                 p=result2.getString(1);
            }
   %>
    <%
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       


        Connection con3 = DriverManager.getConnection("jdbc:odbc:HR", "sa", "123456");
   String l=null;
            PreparedStatement st3 = con3.prepareStatement("select m_name from movie_test_4");
            
            ResultSet result3=st3.executeQuery();
            while(result3.next()){
                 l=result3.getString(1);
            }
   %>
                 
<body>

 <div class="container">
   <div class="header"><img src="current.jpg" width="1080" height="429" /><!-- end .header --></div>
   <div class="content">
     <ul id="MenuBar1" class="MenuBarHorizontal">
            <li><a class="MenuBarItemSubmenu" href="#">LOGIN</a>
        <ul>
          <li><a href="new.jsp">Registered User</a></li>
          <li><a href="register.jsp">New User</a></li>
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
      <li><a href="contact.jsp">Contact Us</a></li>
    </ul>
    <br> <br>
      <p>&nbsp;</p>
      
    
    
     <p>Movie TimeTable For the week......</p>
     <p>Have Fun watching this movie.</p>
     <p>Unregistered user would be redirected to registration page</p>
     <form action ="movie_time" method="post">
      
         USER ID :  <input type="text" value ="please" name="id"></input> <br></br>
            USERName : <input type="text"  value ="please" name="name"></input> <br></br>
            Employee Id : <input type="text" value="please" name="emp_id"></input> <br></br>
       <table width="855" height="415" border="1">
         <tr>
           <td>MOVIE NAME</td>
           <td>9:00-12:00</td>
           <td>12:00-3:00</td>
           <td>3:00-5:00</td>
           <td>5:00-9:00</td>
         </tr>
         <tr>
           <td><input type ="text" name="movie1" readonly="true" value=<%=t%> /></td>
          <td><input type="submit" name="b1" id="button1" value="M1_Book Now1" /></td>
          <td><input type="submit" name="b1" id="b2" value="M1_Book Now2" /></td>
          <td><input type="submit" name="b1" id="b3" value="M1_Book Now3" /></td>
          <td> <input type="submit" name="b1" id="b4" value="M1_Book Now4" /></td>
        </tr>
        <tr>
          <td><input type ="text" name="movie2" readonly="true"value="<%=k %>"/></td>
          <td><input type="submit" name="b1" id="button1" value="M2_Book Now1" /></td>
          <td><input type="submit" name="b1" id="b2" value="M2_Book Now2" /></td>
          <td><input type="submit" name="b1" id="b3" value="M2_Book Now3" /></td>
          <td><input type="submit" name="b1" id="b4" value="M2_Book Now4" /></td>
        </tr>
        <tr>
          <td><input type ="text" name="movie3" readonly="true" value="<%=p %>"/></td>
          <td><input type="submit" name="b1" id="button1" value="M3_Book Now1" /></td>
          <td><input type="submit" name="b1" id="b2" value="M3_Book Now2" /></td>
          <td><input type="submit" name="b1" id="b3" value="M3_Book Now3" /></td>
          <td><input type="submit" name="b1" id="b4" value="M3_Book Now4" /></td>
        </tr>
        <tr>
          <td><input type ="text" name="movie4" readonly="true" value="<%=l %>"/></td>
          <td><input type="submit" name="b1" id="button1" value="M4_Book Now1" /></td>
          <td><input type="submit" name="b1" id="b2" value="M4_Book Now2" /></td>
          <td><input type="submit" name="b1" id="b3" value="M4_Book Now3" /></td>
          <td><input type="submit" name="b1" id="b4" value="M4_Book Now4" /></td>
        </tr>
        
      </table>
      <br>
    </form>
<h1>&nbsp;</h1>
  <!-- end .content --></div>
  <div class="footer">
    <p>This Site Belongs To Book My Show.</p>
  <!-- end .footer --></div>
<!-- end .container --></div>
<script type="text/javascript">
var MenuBar1 = new Spry.Widget.MenuBar("MenuBar1", {imgDown:"SpryAssets/SpryMenuBarDownHover.gif", imgRight:"SpryAssets/SpryMenuBarRightHover.gif"});
</script>
</body>
</html>

