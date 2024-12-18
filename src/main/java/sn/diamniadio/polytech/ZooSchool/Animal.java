package sn.diamniadio.polytech.ZooSchool;

public abstract class Animal {
    private int id;
    private String nom;
    private String categorie; // Nouvel attribut
//    private Proprietaire proprietaire;

    // Constructeur
    public Animal(int id, String nom, String categorie) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

//    public Proprietaire getProprietaire() {
//        return proprietaire;
//    }
//
//    public void setProprietaire(Proprietaire proprietaire) {
//        this.proprietaire = proprietaire;
//    }


    public abstract void sePresenter();

    // Méthodes abstraites
    public abstract void crier();

    public abstract void seDeplacer();

    // Méthode d'affichage
//    @Override
//    public String toString() {
//        String infoProprietaire = (proprietaire != null) ? proprietaire.toString() : "Aucun proprietaire";
//        return "Animal [id=" + id + ", nom=" + nom + ", categorie=" + categorie + ", proprietaire=" + infoProprietaire + "]";
//    }
}

