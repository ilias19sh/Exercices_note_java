public class Professeur extends Personne {
    private double salaire;

    public Professeur(String nom, int age, double salaire) {
        super(nom, age);
        this.salaire = salaire;
    }

    @Override
    public void presenter() {
        System.out.println("Je m’appelle " + nom + ", j’ai " + age + " ans et mon salaire est " + salaire + " €.");
    }

    public void augmenterSalaire(double pct) {
        salaire += salaire * pct / 100;
    }
}
