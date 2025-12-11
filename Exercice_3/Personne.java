public class Personne {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void presenter() {
        System.out.println("Je m’appelle " + nom + " et j’ai " + age + " ans.");
    }
}
