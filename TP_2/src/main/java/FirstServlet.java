import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet",urlPatterns = {"/fs"})
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("vue.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        /*String nom = request.getParameter("nom");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Bonjour "+nom+"</h1>");
        out.println("</body></html>");
        */
       /* int nbCol= Integer.parseInt(request.getParameter("nbCol"));
        int nbLigne= Integer.parseInt(request.getParameter("nbLigne"));*/
        request.getRequestDispatcher("vue.jsp").forward(request,response);

    }
}
