package com.controller;

import com.entity.Student;
import com.googlecode.objectify.Key;

import java.io.IOException;
import com.googlecode.objectify.ObjectifyService;
import static com.googlecode.objectify.ObjectifyService.ofy;
@javax.servlet.annotation.WebServlet(name = "CreateStudentController")

public class CreateStudentController extends javax.servlet.http.HttpServlet {
    static{
        ObjectifyService.register(Student.class);
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String address = request.getParameter("address");
        String rollNumber = request.getParameter("rollNumber");
        String email = request.getParameter("email");
        Student stu = new Student();
        stu.setId(String.valueOf(System.currentTimeMillis()));
        stu.setStatus(1);
        stu.setAddress(address);
        stu.setEmail(email);
        stu.setFullName(fullName);
        stu.setRollNumber(rollNumber);



     Key<Student> key = ofy().save().entity(stu).now();
     if (key!=null){
         System.out.println("ok");
         response.sendRedirect("/_ah/admin");
     }else{
         System.out.println("false");
     }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("registerForm.jsp").forward(request,response);
    }
}
