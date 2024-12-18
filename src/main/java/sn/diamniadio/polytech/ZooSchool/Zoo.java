package sn.diamniadio.polytech.ZooSchool;

import java.util.List;

public class Zoo {
    private int id;
    private String ville;
    private List<Animal> listAnimaux;
    private List<Dresseur> listDresseur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Animal> getListAnimaux() {
        return listAnimaux;
    }

    public void setListAnimaux(List<Animal> listAnimaux) {
        this.listAnimaux = listAnimaux;
    }

    public List<Dresseur> getListDresseur() {
        return listDresseur;
    }

    public void setListDresseur(List<Dresseur> listDresseur) {
        this.listDresseur = listDresseur;
    }
}
