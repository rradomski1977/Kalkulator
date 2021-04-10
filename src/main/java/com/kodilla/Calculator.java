package com.kodilla;


class Calculator {
    public double aMinusB(double a, double b) {
        return a - b;
    }

    public double aPlusB(double a, double b) {
        return a + b;
    }
}

class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double result1 = calculator.aMinusB(12.43, 7.22);

        System.out.println(result1);

        double result2 = calculator.aPlusB(3.45, 5.16);

        System.out.println(result2);
    }
}