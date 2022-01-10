package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/parametros-get")
public class ParametrosGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String saludo = req.getParameter("saludo");
        String nombre = req.getParameter("nombre");
        PrintWriter out = resp.getWriter();
        out.println("parametro saludo = " + (Integer.parseInt(saludo) + 5));
        out.println("<br>");
        out.println("parametro nombre = " + nombre);

    }
}
