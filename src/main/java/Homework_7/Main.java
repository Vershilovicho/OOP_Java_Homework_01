package Homework_7;

import java.util.Scanner;

import Homework_7.Model.ComplexNumber;
import Homework_7.Model.MathOperations;
import Homework_7.Model.interfCalculator;
import Homework_7.View.LogFile;
import Homework_7.View.Logger;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger log = new LogFile("log.txt");
        interfCalculator cal = new MathOperations(log);
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите действительную часть числа:");
        double real = iScanner.nextDouble();
        System.out.println("Введите мнимую часть числа:");
        double imaginary1 = iScanner.nextDouble();
        ComplexNumber n1 = new ComplexNumber(real, imaginary1);

        System.out.print("Введите действие (+,*,/): ");
        char oper = iScanner.next().charAt(0);


        System.out.println("Введите действительную часть:");
        double real2 = iScanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary2 = iScanner.nextDouble();
        ComplexNumber n2 = new ComplexNumber(real2, imaginary2);

        switch (oper) {
            case '+':
                ComplexNumber sum = cal.add(n1, n2);
                System.out.println("Сумма: " + sum);
                break;
            case '*':
                ComplexNumber prod = cal.multiply(n1, n2);
                System.out.println("Произведение: " + prod);
                break;
            case '/':
                ComplexNumber quot = cal.divide(n1, n2);
                System.out.println("Частное: " + quot);
                break;
            default:
                System.out.println("Ошибка, введите одно из действий: +, *, /: ");
                break;

        }
        iScanner.close();
    }
}