package sn.diamniadio.polytech.ZooSchool;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class School {
    private String nom;
    private int id;
    private List<Dresseur> listDresseur;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Dresseur> getListDresseur() {
        return listDresseur;
    }

    public void setListDresseur(List<Dresseur> listDresseur) {
        this.listDresseur = listDresseur;
    }

    private String concate(String allDresseurs, String unDresseur){
        return(allDresseurs +  " " + unDresseur);


    }
    private String afficherListDresseur(){
//      AtomicReference<String> result = new AtomicReference<>(" ");
        ResultDTO result = new ResultDTO();

        this.listDresseur.forEach(dresseur -> {

            result.setResult(concate(result.getResult(), dresseur.getNom()));
            }
        );
        return result.getResult();
    }

//    private String afficherListDresseur(){
//        String result = " ";
//
//        this.listDresseur.forEach(dresseur -> {
//
//            public void setResult{
//                result = concate(result, dresseur.getNom());
//            }
//        }
//    }
    public void former(){System.out.println("Je forme les dresseurs" + afficherListDresseur()); }

    public void entrainer(){}
}
