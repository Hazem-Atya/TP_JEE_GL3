import myclasses.GestionEtudiant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SupprimerEtudiantServlet",urlPatterns = {"/supprimer"})
public class SupprimerEtudiantServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cin =Integer.parseInt(request.getParameter("cin"));
        GestionEtudiant.supprimerEtudiant(cin);

        request.getRequestDispatcher("affichage.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
        
    }
}
