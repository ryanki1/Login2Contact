/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alz.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import javax.inject.Scope;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.ServletSecurity.TransportGuarantee;
import javax.servlet.annotation.HttpConstraint;

/**
 *
 * @author ryanki1
 */




@WebServlet(name = "AddressController", urlPatterns={"/contact"})
@ServletSecurity(
        @HttpConstraint( rolesAllowed = {"AdminRole"})
)
public class AddressController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddressController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddressController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Address addressA = new Address();
        addressA.setAddress1("Herrenstrasse 48");
        addressA.setCity("Freiburg");
        addressA.setPostcode("79098");

        Address addressB = new Address();
        addressB.setAddress1("Schlossbergring 1");
        addressB.setCity("Freiburg");
        addressB.setPostcode("79098");
        
        Address addressC = new Address();
        addressC.setAddress1("Karlstrasse 16");
        addressC.setCity("Freiburg");
        addressC.setPostcode("79098");
        
        response.getWriter().printf("Hello %s", "Kieran");
       
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/contact.html");
        request.setAttribute("address", addressA);
        dispatcher.forward(request, response);
                
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
