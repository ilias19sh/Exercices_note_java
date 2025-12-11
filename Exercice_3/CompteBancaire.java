public class CompteBancaire {
    private String numero;
    private String titulaire;
    private double solde;

    public CompteBancaire(String numero, String titulaire, double soldeInitial) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant invalide");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Retrait impossible");
        }
    }

    public void afficherInfos() {
        System.out.println("Compte numero :" + numero);
        System.out.println("Titulaire : " + titulaire);
        System.out.println("Solde : " + solde + " €");
    }
}
