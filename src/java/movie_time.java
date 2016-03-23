/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class movie_time extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        String id1=request.getParameter("id");
         String name1=request.getParameter("name");
         String emp= request.getParameter("emp_id");
        String c= request.getParameter("b1");
               
                   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             Connection con1 = DriverManager.getConnection("jdbc:odbc:lazysun_HR", "lazysun_sa", "123456");


        
    if(( emp.equals("please"))&&(! id1.equals("please")) && (! name1.equals("please")) ){
            PreparedStatement st1 = con1.prepareStatement("Select * from customer where id=? and cust_name=?");
            st1.setString(1, id1);
            st1.setString(2, name1);
            out.println("hello");
              ResultSet result1 = st1.executeQuery();
             
             
                  if(!result1.next())
                    response.sendRedirect("http://localhost:8080/WebApplication1/register.jsp");                          
          
         
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }


        Connection con = DriverManager.getConnection("jdbc:odbc:lazysun_HR", "lazysun_sa", "123456");


         if(c.equals("M1_Book Now1")){
             String z= request.getParameter("movie1");
         
           PreparedStatement st=con.prepareStatement("update movie_test_1 set movie1=movie1+1,movie2= movie2,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
         
    }
         if(c.equals("M1_Book Now2")){
             String z= request.getParameter("movie1");
         
           PreparedStatement st=con.prepareStatement("update movie_test_1 set movie1=movie1,movie2= movie2+1,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M1_Book Now3")){
             String z= request.getParameter("movie1");
         
           PreparedStatement st=con.prepareStatement("update movie_test_1 set movie1=movie1,movie2= movie2,movie3=movie3+1,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M1_Book Now4")){
             String z= request.getParameter("movie1");
         
           PreparedStatement st=con.prepareStatement("update movie_test_1 set movie1=movie1,movie2= movie2,movie3=movie3,movie4=movie4+1 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M2_Book Now1")){
             String z= request.getParameter("movie2");
         
           PreparedStatement st=con.prepareStatement("update movie_test_2 set movie1=movie1+1,movie2= movie2,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M2_Book Now2")){
             String z= request.getParameter("movie2");
         
           PreparedStatement st=con.prepareStatement("update movie_test_2 set movie1=movie1,movie2= movie2+1,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M2_Book Now3")){
             String z= request.getParameter("movie2");
         
           PreparedStatement st=con.prepareStatement("update movie_test_2 set movie1=movie1,movie2= movie2,movie3=movie3+1,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M2_Book Now4")){
             String z= request.getParameter("movie2");
         
           PreparedStatement st=con.prepareStatement("update movie_test_3 set movie1=movie1,movie2= movie2,movie3=movie3,movie4=movie4+1 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         
         if(c.equals("M3_Book Now1")){
             String z= request.getParameter("movie3");
         
           PreparedStatement st=con.prepareStatement("update movie_test_3 set movie1=movie1+1,movie2= movie2,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
           if(c.equals("M3_Book Now2")){
             String z= request.getParameter("movie3");
         
           PreparedStatement st=con.prepareStatement("update movie_test_3 set movie1=movie1,movie2= movie2+1,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
             if(c.equals("M3_Book Now3")){
             String z= request.getParameter("movie3");
         
           PreparedStatement st=con.prepareStatement("update movie_test_3 set movie1=movie1,movie2= movie2,movie3=movie3+1,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
               if(c.equals("M3_Book Now4")){
             String z= request.getParameter("movie3");
         
           PreparedStatement st=con.prepareStatement("update movie_test_3 set movie1=movie1,movie2= movie2,movie3=movie3,movie4=movie4+1 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
                 if(c.equals("M4_Book Now1")){
             String z= request.getParameter("movie4");
         
           PreparedStatement st=con.prepareStatement("update movie_test_4 set movie1=movie1+1,movie2= movie2,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
                        if(c.equals("M4_Book Now2")){
             String z= request.getParameter("movie4");
         
           PreparedStatement st=con.prepareStatement("update movie_test_4 set movie1=movie1,movie2= movie2+1,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
                               if(c.equals("M4_Book Now3")){
             String z= request.getParameter("movie4");
         
           PreparedStatement st=con.prepareStatement("update movie_test_4 set movie1=movie1,movie2= movie2,movie3=movie3+1,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
                                      if(c.equals("M4_Book Now4")){
             String z= request.getParameter("movie4");
         
           PreparedStatement st=con.prepareStatement("update movie_test_4 set movie1=movie1,movie2= movie2,movie3=movie3,movie4=movie4+1 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
    

}  
        
    
   else  if(! emp.equals("please")){
          PreparedStatement st1 = con1.prepareStatement("Select * from employee1 where empcode=?");
            st1.setString(1, emp);
            
              ResultSet result1 = st1.executeQuery();
                       if(!result1.next())
                    response.sendRedirect("home.jsp"); 
          }
                                   try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }


        Connection con = DriverManager.getConnection("jdbc:odbc:lazysun_HR", "lazysun_sa", "123456");


         if(c.equals("M1_Book Now1")){
             String z= request.getParameter("movie1");
         
           PreparedStatement st=con.prepareStatement("update movie_test_1 set movie1=movie1+1,movie2= movie2,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
         
    }
         if(c.equals("M1_Book Now2")){
             String z= request.getParameter("movie1");
         
           PreparedStatement st=con.prepareStatement("update movie_test_1 set movie1=movie1,movie2= movie2+1,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M1_Book Now3")){
             String z= request.getParameter("movie1");
         
           PreparedStatement st=con.prepareStatement("update movie_test_1 set movie1=movie1,movie2= movie2,movie3=movie3+1,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M1_Book Now4")){
             String z= request.getParameter("movie1");
         
           PreparedStatement st=con.prepareStatement("update movie_test_1 set movie1=movie1,movie2= movie2,movie3=movie3,movie4=movie4+1 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M2_Book Now1")){
             String z= request.getParameter("movie2");
         
           PreparedStatement st=con.prepareStatement("update movie_test_2 set movie1=movie1+1,movie2= movie2,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M2_Book Now2")){
             String z= request.getParameter("movie2");
         
           PreparedStatement st=con.prepareStatement("update movie_test_2 set movie1=movie1,movie2= movie2+1,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M2_Book Now3")){
             String z= request.getParameter("movie2");
         
           PreparedStatement st=con.prepareStatement("update movie_test_2 set movie1=movie1,movie2= movie2,movie3=movie3+1,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         if(c.equals("M2_Book Now4")){
             String z= request.getParameter("movie2");
         
           PreparedStatement st=con.prepareStatement("update movie_test_3 set movie1=movie1,movie2= movie2,movie3=movie3,movie4=movie4+1 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
         
         if(c.equals("M3_Book Now1")){
             String z= request.getParameter("movie3");
         
           PreparedStatement st=con.prepareStatement("update movie_test_3 set movie1=movie1+1,movie2= movie2,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
           if(c.equals("M3_Book Now2")){
             String z= request.getParameter("movie3");
         
           PreparedStatement st=con.prepareStatement("update movie_test_3 set movie1=movie1,movie2= movie2+1,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
             if(c.equals("M3_Book Now3")){
             String z= request.getParameter("movie3");
         
           PreparedStatement st=con.prepareStatement("update movie_test_3 set movie1=movie1,movie2= movie2,movie3=movie3+1,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
               if(c.equals("M3_Book Now4")){
             String z= request.getParameter("movie3");
         
           PreparedStatement st=con.prepareStatement("update movie_test_3 set movie1=movie1,movie2= movie2,movie3=movie3,movie4=movie4+1 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
                 if(c.equals("M4_Book Now1")){
             String z= request.getParameter("movie4");
         
           PreparedStatement st=con.prepareStatement("update movie_test_4 set movie1=movie1+1,movie2= movie2,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
                        if(c.equals("M4_Book Now2")){
             String z= request.getParameter("movie4");
         
           PreparedStatement st=con.prepareStatement("update movie_test_4 set movie1=movie1,movie2= movie2+1,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
                               if(c.equals("M4_Book Now3")){
             String z= request.getParameter("movie4");
         
           PreparedStatement st=con.prepareStatement("update movie_test_4 set movie1=movie1,movie2= movie2,movie3=movie3+1,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
                                      if(c.equals("M4_Book Now4")){
             String z= request.getParameter("movie4");
         
           PreparedStatement st=con.prepareStatement("update movie_test_4 set movie1=movie1,movie2= movie2,movie3=movie3,movie4=movie4+1 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
    }
}
                  

   
                   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(movie_time.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(movie_time.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
    }
    

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String name=request.getParameter("name");
           String id1=request.getParameter("id");
           String c= request.getParameter("b1");
                PrintWriter out = response.getWriter();
            try {
                processRequest(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(movie_time.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            try {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
           }


           Connection con1 = DriverManager.getConnection("jdbc:odbc:lazysun_HR", "lazysun_sa", "123456");


            if(c.equals("M1_Book Now1")){
                String z= request.getParameter("movie1");
            
              PreparedStatement st1=con1.prepareStatement("select movie1 from movie_test_1  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
             if(c.equals("M1_Book Now2")){
                String z= request.getParameter("movie1");
            
              PreparedStatement st1=con1.prepareStatement("select movie2 from movie_test_1  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
 if(c.equals("M1_Book Now3")){
                String z= request.getParameter("movie1");
            
              PreparedStatement st1=con1.prepareStatement("select movie3 from movie_test_1  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
  if(c.equals("M1_Book Now4")){
                String z= request.getParameter("movie1");
            
              PreparedStatement st1=con1.prepareStatement("select movie4 from movie_test_1  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
   if(c.equals("M2_Book Now1")){
                String z= request.getParameter("movie2");
            
              PreparedStatement st1=con1.prepareStatement("select movie1 from movie_test_2  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
   if(c.equals("M2_Book Now2")){
                String z= request.getParameter("movie2");
            
              PreparedStatement st1=con1.prepareStatement("select movie2 from movie_test_2  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
   if(c.equals("M2_Book Now3")){
                String z= request.getParameter("movie2");
            
              PreparedStatement st1=con1.prepareStatement("select movie3 from movie_test_2  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
   if(c.equals("M2_Book Now4")){
                String z= request.getParameter("movie2");
            
              PreparedStatement st1=con1.prepareStatement("select movie4 from movie_test_2  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
   if(c.equals("M3_Book Now1")){
                String z= request.getParameter("movie3");
            
              PreparedStatement st1=con1.prepareStatement("select movie1 from movie_test_3  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
    if(c.equals("M3_Book Now2")){
                String z= request.getParameter("movie3");
            
              PreparedStatement st1=con1.prepareStatement("select movie2 from movie_test_3  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
     if(c.equals("M3_Book Now3")){
                String z= request.getParameter("movie3");
            
              PreparedStatement st1=con1.prepareStatement("select movie3 from movie_test_3  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
      if(c.equals("M3_Book Now4")){
                String z= request.getParameter("movie3");
            
              PreparedStatement st1=con1.prepareStatement("select movie4 from movie_test_3  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
       if(c.equals("M4_Book Now1")){
                String z= request.getParameter("movie4");
            
              PreparedStatement st1=con1.prepareStatement("select movie1 from movie_test_4  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
       if(c.equals("M4_Book Now2")){
                String z= request.getParameter("movie4");
            
              PreparedStatement st1=con1.prepareStatement("select movie2 from movie_test_4  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
           if(c.equals("M4_Book Now3")){
                String z= request.getParameter("movie4");
            
              PreparedStatement st1=con1.prepareStatement("select movie3 from movie_test_4  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
               if(c.equals("M4_Book Now4")){
                String z= request.getParameter("movie4");
            
              PreparedStatement st1=con1.prepareStatement("select movie4 from movie_test_4  where m_name =? ");
             
            
               st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            
       }}
         } catch (SQLException ex) {
            Logger.getLogger(movie_time.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
