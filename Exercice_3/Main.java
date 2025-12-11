public class Main {
    public static void main(String[] args) {

        Personne p1 = new Personne("Luffy", 19);
        Personne p2 = new Personne("Zoro", 21);
        p1.presenter();
        p2.presenter();

        CompteBancaire compte = new CompteBancaire("FR4589", "Luffy", 500);

        compte.deposer(200);
        compte.retirer(100);
        compte.retirer(800); 
        compte.afficherInfos();
    }
}
