package sn.diamniadio.polytech.ZooSchool;

public class Tigre extends Animal {
    public Tigre(int id, String nom) {
        super(id, nom, "Mammifère");
    }

    @Override
    public void sePresenter() {System.out.println("Yo les gars, je m'appelle " + this.getClass().getSimpleName());}

    public void crier() {
        System.out.println(this.getClass().getSimpleName() + " miaule : Miaou !");
    }

    public void seDeplacer() {
        System.out.println(this.getClass().getSimpleName() + " se déplace en marchant.");
    }

}
