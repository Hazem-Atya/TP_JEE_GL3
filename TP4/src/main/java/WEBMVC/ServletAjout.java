package WEBMVC;

import metier.GestionUtilisateur;
import metier.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ServletAjout", urlPatterns = {"/ajout"})
public class ServletAjout extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession maSession = request.getSession(false);
        if (maSession == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        Utilisateur u = (Utilisateur) maSession.getAttribute("user");
        if(u==null)
        {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        GestionUtilisateur gu = new GestionUtilisateur();
        Utilisateur user = new Utilisateur();
        user.setEmail((String)request.getParameter("email"));
        user.setLogin((String)request.getParameter("login"));
        user.setVille((String)request.getParameter("ville"));
        user.setPass((String)request.getParameter("pass"));
        user.setIdUser(Integer.parseInt((String)request.getParameter("id")));
        gu.ajouter(user);
        request.getRequestDispatcher("affichage").forward(request,response);
    }

/*    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
