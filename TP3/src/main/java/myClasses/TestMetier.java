package myClasses;

import java.util.List;
public class TestMetier {
    public static void main(String[] args) {
        MetierImpl metier= new MetierImpl();
        List<Produit> prods = metier.getProduitsParMotCle("");
        for (Produit p : prods)
            System.out.println(p.getNomProduit());
    }
}