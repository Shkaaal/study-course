package com.course.java.shkal.lab5;

public class ThirdFourthTask {
    public static void main(String[] args) {

        ThirdFourthTaskInterface foo = (a, b, c) -> {
            return Math.pow(b, 2) - 4 * a * c;
        };

        System.out.println(foo.strBigLength(5, 5, -10));
    }
}

class FourthTask {
    public static void main(String[] args) {

        ThirdFourthTaskInterface foo = (a, b, c) -> {
            return a * Math.pow(b, c);
        };

        System.out.println(foo.strBigLength(5, 5, 10));
    }
}

interface ThirdFourthTaskInterface {
    double strBigLength(double a, double b, double c);
}
