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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class emp_update extends HttpServlet {

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

        String pass = request.getParameter("pass");
     
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        
        try{
            Connection con = DriverManager.getConnection("jdbc:odbc:lazysun_HR", "lazysun_sa", "123456");


            PreparedStatement st = con.prepareStatement("Select * from employee1 where password=?");
            st.setString(1, pass);
         
            ResultSet result = st.executeQuery();
                               
       
                while (result.next()) {

                    out.println("<form action ='update_emp1' method='post'>");
                    out.println("<br>");
                    out.println("emp_name : ");
                    out.println("<input name ='emp_name' type='text' value='" + result.getString(2).trim() + "' >");
                    out.println("<br>");

                    out.println(" emp_address: ");
                    out.println("<input  name ='emp_address' type='text' value='" + result.getString(3).trim() + "'>");
                 
                    out.println("<br>");

                    out.println("emp_gender  : ");
                    out.println("<input name='emp_gender' type='text' value='" + result.getString(4).trim() + "'>");
                   
                    out.println("<br>");

                    out.println("emp_city: ");
                    out.println("<input name='emp_city'  type='text' value='" + result.getString(5).trim() + "'>");
                      out.println("<br>");

                    out.println("password :");
                    out.println("<input name='password' type='text' value='" + result.getString(6).trim() + "'>");
                    out.println("<br>");
                      out.println("<input type='submit' value='Update'>");
                        
                    out.println("</form>");
                    out.println("<a href='http://localhost:8080/WebApplication1/home.jsp'> Click to return");

                } }catch(Exception ee){
            out.println(ee.getMessage());
        }


            
        }
         catch (ClassNotFoundException ee) 
        {
            out.println(ee.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            try {
                processRequest(request, response);
            } catch (ClassNotFoundException ee) {
               
            }
        } catch (SQLException ex) {
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
                }
        } catch (SQLException ex) {
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
