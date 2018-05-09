/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diana V
 */
@WebServlet(name = "OtroServlet", urlPatterns = {"/OtroServlet"})
public class OtroServlet extends HttpServlet {

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contra = request.getParameter("contra");
        String sexo = request.getParameter("sexo");
        String [] pelis = request.getParameterValues("pelis");
        
        int seleccion = 0;
        for(String p : pelis){
        seleccion = seleccion+Integer.parseInt(p);
}


         
         
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Bye Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>mi contraseña es "+ contra +"BYE SERVLET</h2>");
        out.println("<h2>sexo es "+ sexo + "</h2>");
        out.println("<h2> Las peliculas que elegiste son:" + seleccion +"</h2>");
        out.println("</body>");
        out.println("</html>");
        
        
        
    }

}