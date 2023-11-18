package com.emergentes.controller;

import com.emergentes.bean.BeanContacto;
import com.emergentes.entidades.Contacto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("ESTAMOS EN EL SERVLET");
        BeanContacto dao = new BeanContacto();
        
        List<Contacto> lista = dao.listarTodos();
        
        for (Contacto item : lista){
            item.toString();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
