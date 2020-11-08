import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "IdentificationServlet", urlPatterns = {"/login"})
public class IdentificationServlet extends HttpServlet {
    String login = "Hazem";
    String pwd = "Hazm";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            login = request.getParameter("login");
            pwd = request.getParameter("pwd");
        } catch (Exception e) {
        }
        if (login.equals(pwd)) {
            request.getRequestDispatcher("insertionEtudiant.html").forward(request, response);
        } else {
            request.getRequestDispatcher("echec.html").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String l = request.getParameter("login");
        String p = request.getParameter("pwd");
        if ((l != null) && (p != null)) {
            pwd = p;
            login = l;
        }
        System.out.println("Login =" + login);
        System.out.println("pwd =" + pwd);
        if (this.login.equals(this.pwd)) {
            request.getRequestDispatcher("insertionEtudiant.html").forward(request, response);
        } else {
            request.getRequestDispatcher("echec.html").forward(request, response);
        }
    }
}
