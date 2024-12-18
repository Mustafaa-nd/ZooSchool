package sn.diamniadio.polytech.ZooSchool;

public class Lion extends Animal {
    public Lion(int id, String nom) {
        super(id, nom, "Mammifère");
    }

    @Override
    public void sePresenter() {
        System.out.println("Yo les gars, je m'appelle " + this.getClass().getSimpleName());
    }

    public void crier() {
        System.out.println(this.getClass().getSimpleName() + " miaule : Miaou !");
    }

    public void seDeplacer() {
        System.out.println(this.getClass().getSimpleName() + " se déplace en marchant.");
    }
}
