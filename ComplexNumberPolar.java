public class ComplexNumberPolar extends ComplexNumber {
    
    private double radius;
    private double theta;

    public ComplexNumberPolar() {
        this.radius = 0;
        this.theta = 0;

        super.real = this.radius * Math.cos(this.theta);
        super.imag = this.radius * Math.sin(this.theta);
    }

    public ComplexNumberPolar(double radius, double theta) {
        this.radius = radius;
        this.theta = theta;

        super.real = this.radius * Math.cos(this.theta);
        super.imag = this.radius * Math.sin(this.theta);
    }

    public ComplexNumberPolar(ComplexNumber cn) throws ArithmeticException {
        super();
        this.radius = Math.sqrt(Math.pow(cn.real, 2) + Math.pow(cn.imag, 2));
        try {
            this.theta = Math.atan(cn.imag/cn.real);
            super.real = this.radius * Math.cos(this.theta);
            super.imag = this.radius * Math.sin(this.theta);
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
        return "" + String.format("%.6f", this.real) + " + " + 
            String.format("%.6f", this.imag) + "i : " + 
            String.format("%.6f", this.radius) + 
            "(cos(" + String.format("%.6f", this.theta) + 
            ") + i sin(" + String.format("%.6f", this.theta) + "))";
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

    public ComplexNumberPolar[] roots(int n) throws ArithmeticException {
        try {
            ComplexNumberPolar[] cnpRoots = new ComplexNumberPolar[n];
            double outRadius = Math.pow(this.radius, 1 / n);
            double[] outThetas = new double[n];
            for (int k = 0; k < n; ++k) {
                outThetas[k] = (this.theta + 2 * k * Math.PI) / n;
                cnpRoots[k] = new ComplexNumberPolar(outRadius, outThetas[k]);
            }
            return cnpRoots;
        } catch(ArithmeticException e) {
            System.out.println("roots(): Cannot dviide by 0 (argument provided)");
            throw e;
        }
    }
}
