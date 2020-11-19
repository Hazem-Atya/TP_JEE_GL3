package WEBMVC;

import dao.GestionUsersDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Vector;

@WebServlet(name = "AffichageServlet", urlPatterns = {"/affichage"})
public class AffichageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession maSession = request.getSession(false);
        if (maSession == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        GestionUsersDAO dao = new GestionUsersDAO();
        Vector users = dao.selectAll();
        request.setAttribute("users", users);
        request.getRequestDispatcher("affichage.jsp").forward(request, response);
    }
}
