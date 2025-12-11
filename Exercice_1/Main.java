public class Main {
    public static void main(String[] args) {

        Complexe z1 = new Complexe(2, 3);
        Complexe z2 = new Complexe(1, -4);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);

        System.out.println("Somme : " + z1.addition(z2));
        System.out.println("Produit : " + z1.produit(z2));
        System.out.println("Conjugué de z1 : " + z1.conjugue());
        System.out.println("Module de z1 : " + z1.module());
        System.out.println("Carré de z1 : " + z1.carre());
    }
}
