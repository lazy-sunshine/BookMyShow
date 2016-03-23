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
public class current_movie extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         
        String c= request.getParameter("b1");
        String z=request.getParameter("movie");
        String id1=request.getParameter("id");
         
               try{
                   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
        
    
  

        Connection con1 = DriverManager.getConnection("jdbc:odbc:lazysun_HR", "lazysun_sa", "123456");


            PreparedStatement st1 = con1.prepareStatement("Select * from customer where id=?");
            st1.setString(1, id1);
              ResultSet result1 = st1.executeQuery();
             
                  if(!result1.next())
                    response.sendRedirect("http://localhost:8080/WebApplication1/register.jsp");                          
                  
            }catch(Exception ee){
                out.println("somethng " +ee.getMessage());
}

    
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(current_movie.class.getName()).log(Level.SEVERE, null, ex);
        }
            try{
             
                Connection con= DriverManager.getConnection("jdbc:odbc:lazysun_HR","lazysun_sa","123456");
                   if(c.equals("Book Now1")){
           PreparedStatement st=con.prepareStatement("update current_movie set movie1=movie1+1,movie2= movie2,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st.setString(1,z);
           st.executeUpdate();
          
                   }
           
                      if(c.equals("Book Now2")){
           PreparedStatement st1=con.prepareStatement("update current_movie set movie1=movie1,movie2= movie2+1,movie3=movie3,movie4=movie4 where m_name =? ");
          
           st1.setString(1,z);
           st1.executeUpdate();
         
            } 
                            if(c.equals("Book Now3")){
           PreparedStatement st1=con.prepareStatement("update current_movie set movie1=movie1,movie2= movie2,movie3=movie3+1,movie4=movie4 where m_name =? ");
          
           st1.setString(1,z);
           st1.executeUpdate();
          
            }
                                  if(c.equals("Book Now4")){
           PreparedStatement st1=con.prepareStatement("update current_movie set movie1=movie1,movie2= movie2,movie3=movie3,movie4=movie4+1 where m_name =? ");
          
           st1.setString(1,z);
           st1.executeUpdate();
         
            }
                   
            }catch(Exception ee)
            {
                out.println("error " +ee.getMessage());
            }
            
            try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(current_movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(current_movie.class.getName()).log(Level.SEVERE, null, ex);
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
        String name=request.getParameter("name");
          String z=request.getParameter("movie");
          String c= request.getParameter("b1");
          PrintWriter out = response.getWriter();
       
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(current_movie.class.getName()).log(Level.SEVERE, null, ex);
        }
         try{
             
                Connection con= DriverManager.getConnection("jdbc:odbc:lazysun_HR","lazysun_sa","123456");
                   if(c.equals("Book Now1")){
            PreparedStatement st1=con.prepareStatement("Select movie1 from current_movie where m_name =? ");
            st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            }}
                      if(c.equals("Book Now2")){
            PreparedStatement st1=con.prepareStatement("Select movie2 from current_movie where m_name =? ");
            st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            }}
                         if(c.equals("Book Now3")){
            PreparedStatement st1=con.prepareStatement("Select movie3 from current_movie where m_name =? ");
            st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            }}
                            if(c.equals("Book Now4")){
            PreparedStatement st1=con.prepareStatement("Select movie4 from current_movie where m_name =? ");
            st1.setString(1,z);
                  ResultSet result1= st1.executeQuery();
                 while(result1.next()){ 
           out.println("Dear "+name +" your seat is " +result1.getString(1));
            }}
            }catch(Exception ee){
                out.println("wrong error" + ee.getMessage());
            }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
