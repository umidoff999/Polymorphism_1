package Polymorphism;

public class Main {
    public static void main(String[] args) {
        MathFunctions functions = new MathFunctions();

        System.out.println(functions.add(5, 3));
        System.out.println(functions.sub(7, 2));
        System.out.println(functions.multiply(4, 6));
        System.out.println(functions.div(20.0, 4.0));
        System.out.println(functions.abs(-7));
        System.out.println(functions.pow(3));
    }
}

