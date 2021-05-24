public class Complex extends Number implements Cloneable, Comparable<Complex> {
    private double a; //a is real part
    private double b; //b is imaginary

    public Complex() {
        this(0);
    }

    public Complex(double a) {
        this(a, 0);
    }
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Complex add(Complex complex) {
        return new Complex(a + complex.a, b + complex.b);
    }

    public Complex subtract(Complex complex) {
        return new Complex(a - complex.a, b - complex.b);
    }
    //(a+bi)*(c+di)=(ac-bd)+(ad+bc)i
    public Complex multiply(Complex complex) {
        return new Complex(a*complex.a - b*complex.b, a*complex.b + b*complex.a);
    }

    public Complex divide(Complex complex) {
        return new Complex((a*complex.a + b*complex.b)/(Math.pow(complex.a,2)+ Math.pow(complex.b, 2)),
                (b*complex.a - a*complex.b)/(Math.pow(complex.a, 2) + Math.pow(complex.b, 2)));
    }
    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double getRealPart() {
        return a;
    }
    public void setRealPart(double a) {
        this.a = a;
    }
    public double getImaginaryPart() {
        return b;
    }
    public void setImaginaryPart(double b) {
        this.b = b;
    }
    @Override
    public String toString() {
        if (b == 0 && a >= 1 && (a % Math.floor(a) == 0))
            return (int)(a) + "";
        else if (b == 0 && a <= -1 && (a % Math.ceil(a) == 0))
            return (int)(a) + "";
        else if (b==0)
            return a + "";
        return a + " + " + b + "i";
    }
    @Override
    public Complex clone() throws CloneNotSupportedException {
        return (Complex)super.clone();
    }

    @Override
    public int compareTo(Complex complex) {
        if (abs() > complex.abs())
            return 1;
        else if (abs() < complex.abs())
            return -1;
        else
            return 0;
    }

    public boolean equals(Complex complex) {
        return a == complex.a && b == complex.b;
    }

    @Override
    public int intValue() {
        return (int)(abs());
    }

    @Override
    public long longValue() {
        return (long)(abs());
    }

    @Override
    public float floatValue() {
        return (float)(abs());
    }

    @Override
    public double doubleValue() {
        return abs();
    }

}
