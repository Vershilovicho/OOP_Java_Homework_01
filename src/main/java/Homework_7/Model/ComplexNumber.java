package Homework_7.Model;
public class ComplexNumber {
    protected double real;
    protected double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * @return Вещественная часть
     */
    public double getReal() {
        return real;
    }

    /**
     * @return Мнимая часть
     */
    public double getImaginary() {
        return imaginary;
    }


//  Сложение

    public ComplexNumber add(ComplexNumber other) {
        double sumMaterial = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumMaterial, sumImaginary);
    }


//    Умножение

    public ComplexNumber multiplication(ComplexNumber other) {
        double productMaterial = this.real * other.real - this.imaginary * other.imaginary;
        double productImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(productMaterial, productImaginary);
    }

//    Деление
    public ComplexNumber divide(ComplexNumber other) {
        double divisor = other.real * other.real + other.imaginary * other.imaginary;
        double qMaterial = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
        double qImaginary = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
        return new ComplexNumber(qMaterial, qImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}