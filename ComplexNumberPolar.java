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

    public ComplexNumberPolar(ComplexNumber cn) throws ArithmeticException {
        super();
        this.radius = Math.sqrt(Math.pow(cn.real, 2) + Math.pow(cn.imag, 2));
        try {
            this.theta = Math.atan(cn.imag/cn.real);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double getTheta() {
        return this.theta;
    }

    @Override
    public String toString() {
        return "";
    }

    public ComplexNumberPolar mult(ComplexNumberPolar rhs) {
        double outRadius = this.radius * rhs.radius;
        double outTheta = this.theta + rhs.theta;
        return new ComplexNumberPolar(outRadius, outTheta);
    }

    public ComplexNumberPolar div(ComplexNumberPolar rhs) throws ArithmeticException {
        try {
            double outRadius = this.radius / rhs.radius;
            double outTheta = this.theta - rhs.theta;
            return new ComplexNumberPolar(outRadius, outTheta);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by 0 (RHS Radius)");
            throw e;
        }
    }

    public ComplexNumberPolar pow(int n) {
        double outRadius = Math.pow(this.radius, n);
        double outTheta = n * this.theta;
        return new ComplexNumberPolar(outRadius, outTheta);
    }

    public ComplexNumberPolar[] roots(int n) {
        
    }
}
