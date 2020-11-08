import myclasses.Etudiant;
import myclasses.GestionEtudiant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InsertionEtudiantServlet",urlPatterns = {"/insertion"})
public class InsertionEtudiantServlet extends HttpServlet {
        GestionEtudiant g= new GestionEtudiant();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom=request.getParameter("prenom");
        String email = request.getParameter("email");
        int age = Integer.parseInt(request.getParameter("age"));
        int cin = Integer.parseInt(request.getParameter("cin"));
        Etudiant e = new Etudiant(nom,prenom,email,age,cin);
        g.ajouterEtudiant(e);
        request.setAttribute("etudiants",g.getEtudiants());
        request.getRequestDispatcher("affichage.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }

}
