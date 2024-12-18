package sn.diamniadio.polytech.ZooSchool;

public abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected int age;


    // Constructeur
    public Personne(int id, String nom, String prenom, int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Méthode d'affichage



    public void parler() {
        System.out.println("Je parle comme une " + this.getClass().getSimpleName());
    }

    public void reflechir() {
        System.out.println("Je réflechis comme une " + this.getClass().getSimpleName());
    }

    public abstract void Parler();

//    public void bavarder(){
//        System.out.println("Je bavarde comme un " + this.getClass().getSimpleName());
//
//    }
}

