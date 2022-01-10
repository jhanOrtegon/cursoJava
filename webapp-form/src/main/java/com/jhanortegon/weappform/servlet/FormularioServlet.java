package com.jhanortegon.weappform.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/registro")
public class FormularioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String nombre = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String pais = req.getParameter("pais");
        String[] lenguajes = req.getParameterValues("lenguajes");
        String[] perfiles = req.getParameterValues("perfiles");
        String idioma = req.getParameter("idioma");
        String habilitar = req.getParameter("habilitar");
        String secreto = req.getParameter("secreto");
        List<String> errores = new ArrayList<>();
        if(nombre == null || nombre.isBlank()) errores.add("ingresa un usuario valido");
        if(password == null || password.isBlank()) errores.add("ingresa un password valido");
        if(email == null || email.isBlank() || !email.contains("@")) errores.add("ingresa un email valido");
        if(pais == null || pais.isBlank() || pais.equals("0") ) errores.add("ingresa un pais valido");
        if(lenguajes == null || lenguajes.length <= 0 ) errores.add("ingresa un lenguaje valido");
        if(perfiles == null || perfiles.length <= 0) errores.add("ingresa un perfil valido");
        if(idioma == null || idioma.isBlank()) errores.add("ingresa un idioma valido");
        if(habilitar == null || habilitar.isBlank()) errores.add("ingresa un habilitar valido");

        PrintWriter out = resp.getWriter();
        if(errores.size() <= 0){
            out.println("usuario : " + nombre);
            out.println("<br>");
            out.println("contraseña: " + password);
            out.println("<br>");
            out.println("email: " + email);
            out.println("<br>");
            out.println("pais: " + pais);
            out.println("<br>");
            out.println("lenguajes: ");
            int indice = 1;
            for (String lenguaje : lenguajes) {
                if (lenguajes.length != indice) {
                    out.println(lenguaje + ", ");
                } else {
                    out.println(lenguaje);
                }
                indice++;
            }
            indice = 1;
            out.println("<br>");
            out.println("Perfiles: ");
            for (String perfile : perfiles) {
                if (perfiles.length != indice) {
                    out.println(perfile + ", ");
                } else {
                    out.println(perfile);
                }
                indice++;
            }
            out.println("<br>");
            out.println("Idioma: " + idioma);
            out.println("<br>");
            out.println("habilitado: " + habilitar);
            out.println("<br>");
            out.println("secreto: " + secreto);
        }else{
            out.println("<h1>Lista de errores</h1>");
            for(String error : errores){
                out.println(error);
                out.println("<br>");
            }
            out.println("<p><a href = \"/webapp-form\">regresar</a></p>");
        }
    }
}
