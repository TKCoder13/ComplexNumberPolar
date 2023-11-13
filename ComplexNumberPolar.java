public class ComplexNumberPolar extends ComplexNumber {
    
    private double radius;
    private double theta;

    public ComplexNumberPolar() {
        radius = 0;
        theta = 1;
    }

    public ComplexNumberPolar(double radius, double theta) {
        this.radius = radius;
        this.theta = theta;
    }

    public ComplexNumberPolar(ComplexNumber cn) {
        super();
    }

    public double getRadius() {
        return this.radius;
    }

    public double getTheta() {
        return this.theta;
    }

    public String toString() {

    }

    public ComplexNumberPolar mult(ComplexNumberPolar rhs) {

    }

    public ComplexNumberPolar div(ComplexNumberPolar rhs) {

    }

    public ComplexNumberPolar pow(int n) {

    }

    public ComplexNumberPolar[] roots(int n) {
        
    }
}
