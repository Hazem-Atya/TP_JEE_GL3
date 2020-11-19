package metier;



import dao.GestionUsersDAO;

import java.util.Vector;
/**
 *
 * @author USER
 */
public class GestionUtilisateur { GestionUsersDAO dao; public GestionUtilisateur()
{
    dao=new GestionUsersDAO();
}
    public Utilisateur Chercher(String login, String pass){
        return dao.loadUser(login, pass);
    }
    public void ajouter(Utilisateur u){
        dao.addUser(u.getLogin(), u.getPass(),u.getEmail(),u.getVille());
    }
    public Vector lister(){
        return dao.selectAll();
    }
}