package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/task2")
public class Task2Servlet extends HttpServlet {
// Этот свервлет будет отправлять запрос, где мы передаем name, surname


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("userName");
//        String surname = req.getParameter("userSurname");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        String surname = req.getParameter("userSurname");

        req.setAttribute("name", name);
        req.setAttribute("surName", surname);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
