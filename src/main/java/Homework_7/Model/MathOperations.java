package Homework_7.Model;

import Homework_7.View.Logger;

/**
 * калькулятор для кч
 */

public class MathOperations implements interfCalculator {
    private Logger log;

    public MathOperations(Logger log){
        this.log = log;
    }

    @Override
    public ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber result = n1.add(n2);
        log.log("Cложение: " + n1 + " + " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber result = n1.multiplication(n2);
        log.log("Умножение: " + n1 + " * " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber result = n1.divide(n2);
        log.log("Деление: " + n1 + " / " + n2 + " = " + result);
        return result;
    }



}