package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Cliente;

/**
 *
 * @author Pablo Andres
 */
@WebServlet(name = "AdminServlet", urlPatterns = {"/admin"})
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       Cliente cliente = (Cliente)request.getSession().getAttribute("Cliente");
       if (cliente == null) request.getRequestDispatcher("/login.jsp").forward(request, response);
        
       request.getRequestDispatcher("admin.jsp").forward(request, response);
    }
}