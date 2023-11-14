# CNP ToDo List

## Private Variables
- [x] radius: double
- [x] theta: double

## Methods 
- [x] ComplexNumberPolar()
- [x] ComplexNumberPolar(double, double)
- [x] ComplexNumberPolar(ComplexNumber)
- [x] getRadius(): double
- [x] getTheta(): double
- [x] toString(): String
- [x] mult(ComplexNumberPolar): ComplexNumberPolar
- [x] div(ComplexNumberPolar): ComplexNumberPolar
- [x] pow(int): ComplexNumberPolar
- [x] roots(int): ComplexNumberPolar[]

## Notes
* Function mult(ComplexNumberPolar rhs) multiplies two complex numbers in polar form, 𝑡ℎ𝑖𝑠 ∗ 𝑟ℎ𝑠
* Function div(ComplexNumberPolar rhs) divides two complex numbers in polar form, 𝑡ℎ𝑖𝑠/𝑟ℎ𝑠.
* Function pow(int n) raises a complex number in polar form to the given power, 𝑡ℎ𝑖𝑠^𝑛

* This is a Java only assignment
* Make member variables of your ComplexNumber class protected (not private)
* When you set radius and theta values (in the derived class), make sure you set real and imaginary values (in the base class)