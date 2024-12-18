package sn.diamniadio.polytech.ZooSchool;

public class Chat {
    private int id;
    private String nom;
    private String prenom;

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

    private static Chat uniqueChat = null;

    public static Chat getChat() {
        if (uniqueChat == null){
            Chat nouveauChat = new Chat();
            uniqueChat= nouveauChat;

            return uniqueChat;
        }
        return uniqueChat;
    }
}
