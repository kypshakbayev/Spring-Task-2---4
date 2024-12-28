package servlets;

import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

import static com.sun.beans.introspect.PropertyInfo.Name.description;

@WebServlet(value = "/addItem")
public class AddItem extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("addItem.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String opisanie = req.getParameter("opisanie");
        String deadlineDate = req.getParameter("deadlineDate");
        String description = req.getParameter("description");



        Item item = new Item();
        item.setName(name);
        item.setOpisanie(opisanie);
        item.setDeadlineDate(deadlineDate);
        item.setDescription(description);


        DBManager.addTask(item);
        resp.sendRedirect("/task1");
    }
}
