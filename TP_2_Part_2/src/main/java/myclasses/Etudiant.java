package myclasses;

public class Etudiant {

    private String nom;
    private String prenom;
    private String email;
    private int age;
    private int cin;


    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public Etudiant(String nom, String prenom , String email , int age , int cin)
    {
        this.age=age;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.cin=cin;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
