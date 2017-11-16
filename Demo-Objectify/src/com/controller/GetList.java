package com.controller;

import com.entity.Student;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.cmd.Query;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static com.googlecode.objectify.ObjectifyService.ofy;

public class GetList extends HttpServlet {
    static {
        ObjectifyService.register(Student.class);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Query<Student> query = ofy().load().type(Student.class).limit(5);

        String cursorStr  = req.getParameter("cursor");
        if (cursorStr!=null){
            query.startAt(Cursor.fromWebSafeString(cursorStr));
        }

        QueryResultIterator<Student> iterator = query.iterator();
        req.setAttribute("iterator",iterator);
        req.getRequestDispatcher("fetchingList.jsp").forward(req,resp);

    }
}
