package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String ename = request.getParameter("EmployeeName");
        String email = request.getParameter("EmployeeEmailid");
        String password = request.getParameter("Password");
        String salary = request.getParameter("Salary");
        String gender = request.getParameter("Gender");

        out.println("<html>");
        
        out.println("<body bgcolor='yellow' text='red'>");
        out.println("<center>");
        out.println("<h1>Registration Details</h1>");
        out.println("<p>Employee Name: " + ename + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("<p>Salary: " + salary + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
