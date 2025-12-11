public class Complexe {
    protected double a;
    protected double b;

    public Complexe(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complexe addition(Complexe z) {
        return new Complexe(this.a + z.a, this.b + z.b);
    }

    public Complexe produit(Complexe z) {
        double re = this.a * z.a - this.b * z.b;
        double im = this.a * z.b + this.b * z.a;
        return new Complexe(re, im);
    }

    public Complexe conjugue() {
        return new Complexe(this.a, -this.b);
    }

    public double module() {
        return Math.sqrt(a * a + b * b);
    }

    public Complexe carre() {
        return this.produit(this);
    }

    @Override
    public String toString() {
        return a + " + " + b + "i";
    }
}
