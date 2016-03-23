/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class update_movie extends HttpServlet {

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
      
        String c=request.getParameter("b1");
        
       try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             
                Connection con= DriverManager.getConnection("jdbc:odbc:lazysun_HR","lazysun_sa","123456");
                
               if(c.equals("update1")){ 
                  try{ 
                  String m_name1=request.getParameter("t1");
                  out.println(m_name1);
                   PreparedStatement st= con.prepareStatement("update movie_test_1 set m_name=?,movie1='0',movie2='0', movie3='0',movie4='0'");
                     
                             st.setString(1,m_name1);
                            
                              st.executeUpdate();
                              out.println("Transaction completed");
                  }catch(Exception ee){
                      out.println(ee.getMessage());
                  }
               
    }
      if(c.equals("update2")){  
          try{
                  String m_name2=request.getParameter("t2");
                   PreparedStatement st= con.prepareStatement("update movie_test_2 set m_name=?,movie1='0',movie2='0', movie3='0',movie4='0'");
                     
                             st.setString(1,m_name2);
                            
                              st.executeUpdate();
                              out.println("Transaction completed");
               
    }catch(Exception ee){
                      out.println(ee.getMessage());
                  }
          }
      if(c.equals("update3")){ 
          try{
                  String m_name3=request.getParameter("t3");
                   PreparedStatement st= con.prepareStatement("update movie_test_3 set m_name=?,movie1='0',movie2='0', movie3='0',movie4='0'");
                     
                             st.setString(1,m_name3);
                            
                              st.executeUpdate();
                              out.println("Transaction completed");
               
   }catch(Exception ee){
                      out.println(ee.getMessage());
                  } }
       if(c.equals("update4")){            
                  String m_name4=request.getParameter("t4");
                   PreparedStatement st= con.prepareStatement("update movie_test_4 set m_name1=?,movie1='0',movie2='0', movie3='0',movie4='0'");
                     
                             st.setString(1,m_name4);
                            
                              st.executeUpdate();
                              out.println("Transaction completed");
               
    }
    
    
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(update_movie.class.getName()).log(Level.SEVERE, null, ex);
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
            processRequest(request, response);
             PrintWriter out = response.getWriter();
          
        } catch (SQLException ex) {
            Logger.getLogger(update_movie.class.getName()).log(Level.SEVERE, null, ex);
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
