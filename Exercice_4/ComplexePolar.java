public class ComplexePolar extends Complexe {
    private double angle;

    public ComplexePolar(double a, double b) {
        super(a, b);
        this.angle = Math.atan2(b, a);
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public String toString() {
        return super.toString() + " (angle = " + angle + " rad)";
    }
}
