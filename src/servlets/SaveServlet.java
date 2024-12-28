package servlets;

import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = "/save")
public class SaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("idshka"));
        String opisanie = req.getParameter("opisanie");
        String name = req.getParameter("name");
        String deadlineDate = req.getParameter("deadlineDate");
        String description = req.getParameter("description");

        Item item = new Item(id,name,opisanie,description,deadlineDate);

        DBManager.saveItem(item);
        resp.sendRedirect("/task1");
    }
}
