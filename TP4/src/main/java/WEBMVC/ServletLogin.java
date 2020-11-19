package WEBMVC;

import dao.GestionUsersDAO;
import metier.GestionUtilisateur;
import metier.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletLogin",urlPatterns = {"/login"})
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = (String)request.getParameter("login");
        String pwd = (String)request.getParameter("password");
        GestionUtilisateur gu = new GestionUtilisateur();

        Utilisateur u = gu.chercher(login,pwd);
        if (u==null)
        {
            String msg = "Coordonnées eronnés";
            request.setAttribute("msg",msg);
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
        else
        {
            HttpSession maSession = request.getSession(true);
            maSession.setAttribute("user", u);
            request.getRequestDispatcher("bienvenue.jsp").forward(request,response);
        }
/*
        PrintWriter out = response.getWriter() ;
        out.println("<h1>"+login+"</h1>");
        out.println(u.getEmail());
*/
    }

   /* protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
