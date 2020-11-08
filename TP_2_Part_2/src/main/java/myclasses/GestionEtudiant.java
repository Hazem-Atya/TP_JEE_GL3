package myclasses;

import myclasses.Etudiant;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GestionEtudiant {
    static private   List etudiants= new ArrayList<Etudiant>();

    static public List getEtudiants() {
        return etudiants;
    }

    public void ajouterEtudiant(Etudiant e) {
        this.etudiants.add(e) ;
    }
    public static void supprimerEtudiant(int cin)
    {
        ListIterator li = etudiants.listIterator() ;
        while(li.hasNext())
        {
            Etudiant e = (Etudiant)li.next();
            if(e.getCin()==cin)
            {
                etudiants.remove(e);
                break;
            }
        }
    }
}
