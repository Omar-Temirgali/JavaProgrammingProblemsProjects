import java.text.DecimalFormat;

public class Complex {
    private double a;
    private double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex(double a) {
        this(a, 0);
    }

    public Complex() {
        this(0);
    }

    public Complex add(Complex complex) {
        return new Complex((a + complex.a), (b + complex.b));
    }

    public Complex subtract(Complex complex) {
        return new Complex((a - complex.a), (b - complex.b));

    }

    public Complex multiply(Complex complex) {
        return new Complex((a * complex.a - b * complex.b), (b * complex.a + a * complex.b));
    }

    public Complex divide(Complex complex) {
        return new Complex((a * complex.a + b * complex.b) / ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))),
                (b * complex.a - a * complex.b) / ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))));
    }

    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    @Override
    public String toString() {
        if (b == 0) return a + "";
        DecimalFormat decimal = new DecimalFormat("#.###");
        return "(" + decimal.format(a) + " + " + decimal.format(b) + "i)";

    }
}