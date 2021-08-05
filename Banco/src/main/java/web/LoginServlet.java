package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import models.Cliente;
import servicio.ClienteService;



@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    
    @Inject
    private ClienteService clienteService;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String rut = request.getParameter("rut");
       String clave = request.getParameter("clave");
       
       System.out.println("/n");
       System.out.println("Rut: " + rut);
       System.out.println("Password: " + clave);
       
       Cliente cliente = clienteService.buscarClientePorRut(new Cliente(rut));
       System.out.println("CLIENTE: " + cliente);
       
       if (cliente != null){
           
           request.getSession().setAttribute("cliente", cliente);
           request.getRequestDispatcher("admin.jsp").forward(request, response);
          
       }else{
       request.setAttribute("error", "Usuario no registrado");
       request.getRequestDispatcher("login.jsp").forward(request, response);
       }
       
    }

}
