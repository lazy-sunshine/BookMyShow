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
public class login extends HttpServlet {

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

        String user = request.getParameter("login_name");
        String pass = request.getParameter("login_pass");
        String c = request.getParameter("login_buttton");


        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }


        Connection con = DriverManager.getConnection("jdbc:odbc:lazysun_HR", "lazysun_sa", "123456");


            PreparedStatement st = con.prepareStatement("Select * from customer where cust_name=? and cust_pass=?");
            st.setString(1, user);
           
            st.setString(2, pass);
         
            ResultSet result = st.executeQuery();
          
           
            if (c.equals("submit1") ){
                    if(result.next() ) 
              response.sendRedirect("http://localhost:8080/WebApplication1/intro.jsp");
                    else 
                           response.sendRedirect("http://localhost:8080/WebApplication1/new.jsp");

            } else if (c.equals("submit")) {

                while (result.next()) {

                    out.println("<form action ='update' method='post'>");
                    out.println("<br>");
                    out.println("ID  : ");
                    out.println("<input name ='user_id' type='text' value='" + result.getString(1).trim() + "' >");
                    out.println("<br>");

                    out.println("UserName : ");
                    out.println("<input  name ='user_name' type='text' value='" + result.getString(2).trim() + "'>");
                 
                    out.println("<br>");

                    out.println("Password  : ");
                    out.println("<input name='pass_word' type='text' value='" + result.getString(3).trim() + "'>");
                   
                    out.println("<br>");

                    out.println("Email id : ");
                    out.println("<input name='email_id'  type='text' value='" + result.getString(4).trim() + "'>");
                      out.println("<br>");

                    out.println("Phone no. :");
                    out.println("<input name='ph_no' type='text' value='" + result.getString(5).trim() + "'>");
                    out.println("<br>");

                    out.println("Gender : ");
                    out.println("<input name='gender' type='text' value='" + result.getString(6).trim() + "'>");
                        out.println("<br><br>");
                      out.println("<input type='submit' value='Update1'>");
                        
                    out.println("</form>");
                    out.println("<a href='http://localhost:8080/WebApplication1/intro.html'> Click to return");

                }


            }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            try {
                processRequest(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
            try {
                processRequest(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
