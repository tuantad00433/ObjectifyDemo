package com.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.entity.Student;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class LookupForm extends HttpServlet {
    static {
        ObjectifyService.register(Student.class);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Student student = ofy().load().key(Key.create(Student.class, id)).now();
        req.setAttribute("studentFound",student);
        req.getRequestDispatcher("editForm.jsp").forward(req,resp);

    }
}
