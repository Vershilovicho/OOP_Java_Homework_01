package Homework_7.Model;

public interface interfCalculator {

    /**
     * сложение
     */
    ComplexNumber add(ComplexNumber n1, ComplexNumber n2);

    /**
     * умножение
     */
    ComplexNumber multiply(ComplexNumber n1, ComplexNumber n2);

    /**
     * деление
     */
    ComplexNumber divide(ComplexNumber n1, ComplexNumber n2);
}