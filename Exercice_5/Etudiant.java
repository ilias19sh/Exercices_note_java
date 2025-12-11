public class Etudiant extends Personne {
    private String cne;

    public Etudiant(String nom, int age, String cne) {
        super(nom, age);
        this.cne = cne;
    }

    @Override
    public void presenter() {
        super.presenter();
        System.out.println("Mon CNE est " + cne + ".");
    }
}
