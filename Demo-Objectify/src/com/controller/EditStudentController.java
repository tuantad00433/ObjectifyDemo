package com.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.entity.Student;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Result;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class EditStudentController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student();
        String fullName = req.getParameter("fullName");
        String address = req.getParameter("address");
        String email = req.getParameter("email");
        String rollNum = req.getParameter("rollNumber");
        String id = req.getParameter("id");
        int status = Integer.valueOf(req.getParameter("status"));

        student.setRollNumber(rollNum);
        student.setFullName(fullName);
        student.setAddress(address);
        student.setEmail(email);
        student.setId(id);
        student.setStatus(status);

        ofy().save().entity(student);
        resp.sendRedirect("/_ah/admin");
        System.out.println("ok");


    }
}
