public class Personne {
    protected String nom;
    protected int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void presenter() {
        System.out.println("Je m’appelle " + nom + " et j’ai " + age + " ans.");
    }
}
