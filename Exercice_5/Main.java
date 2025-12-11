public class Main {
    public static void main(String[] args) {
        Personne[] personnes = new Personne[3];

        personnes[0] = new Etudiant("Luffy", 19, "CNE123");
        personnes[1] = new Professeur("Zoro", 21, 2500);
        personnes[2] = new Personne("Nami", 22);

        for (Personne p : personnes) {
            p.presenter();
        }

        ((Professeur)personnes[1]).augmenterSalaire(10);
        System.out.println("Après augmentation :");
        personnes[1].presenter();
    }
}
