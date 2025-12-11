public class Main {
    public static void main(String[] args) {
        Complexe z1 = new Complexe(2, 3);
        ComplexePolar zp = new ComplexePolar(1, -1);

        System.out.println("z1 = " + z1);
        System.out.println("zp = " + zp);

        System.out.println("Somme z1 + zp = " + z1.addition(zp));
        System.out.println("Produit z1 * zp = " + z1.produit(zp));
        System.out.println("Conjugué de zp = " + zp.conjugue());
        System.out.println("Module de zp = " + zp.module());
    }
}
