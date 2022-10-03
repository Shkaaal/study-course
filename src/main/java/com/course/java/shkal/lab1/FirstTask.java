package com.course.java.shkal.lab1;

import java.util.Scanner;

public class FirstTask {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ответ при решении первого уравнения: " + firstTaskEquation());
        System.out.println("Ответ при решении первого уравнения: " + secondTaskEquation());
    }

    public static double firstTaskEquation() {
        System.out.println("Введите значение w = ");
        double w = scanner.nextDouble();
        System.out.println("Введите значение x = ");
        double x = scanner.nextDouble();
        System.out.println("Введите значение y = ");
        double y = scanner.nextDouble();

        return (Math.pow(Math.E, Math.sqrt(Math.abs(w + 1))) * Math.tan(x) * (-Math.sin(w)))
                / (1.85 * w + Math.pow(y, (2.0 / 3.0)));
    }

    public static double secondTaskEquation() {
        System.out.println();
        System.out.println("Введите значение x = ");
        double x = scanner.nextDouble();
        System.out.println("Введите значение y = ");
        double y = scanner.nextDouble();
       return  (Math.abs(x) - Math.sin(Math.pow(x, 3))) / (1 + Math.abs(x) * Math.abs(y));
    }
}