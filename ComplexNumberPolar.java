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
}
