package servlets;

import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(value="/task1")
public class Task1Servlet extends HttpServlet {
// Этот сервлет для отображения самой страницы index.jsp
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Item> itemList = DBManager.getAllTasks();
        req.setAttribute("tovary", itemList);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
