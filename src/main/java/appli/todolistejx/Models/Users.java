package appli.todolistejx.Models;

public class Users {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private int actif;g
    private int age;

    public Users (int id,String nom,String prenom,String email,String mdp,int actif,int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.actif = actif;
        this.age = age;
    }


    // Getter
    public String getPrenom() {
        return this.nom;
    }

    // Setter
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    // Getter
    public String getPernom() {
        return this.prenom;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    }

