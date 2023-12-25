package Polymorphism;

public class MathFunctions {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public int abs(int num) {
        if (num < 0) {
            return -num;
        }
        return num;
    }

    public int pow(int num) {
        return num * num;
    }
}

