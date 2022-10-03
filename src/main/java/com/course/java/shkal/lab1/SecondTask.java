package com.course.java.shkal.lab1;

import java.util.Scanner;

public class SecondTask {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fourteenthTask();
        secondTask();
        sixthTask();
        sixteenthTask();
    }

    public static void fourteenthTask() {
        //С клавиатуры вводится коэффициент b.  Решить уравнение ах = b, где а = cos(b) + 5* b.
        System.out.println("Первое задание\nВведите коэффициент b: ");
        double b = scanner.nextDouble();

        double a = Math.cos(b) + (5 * b);
        double x = b - a;
        System.out.println("x = " + x);
    }

    public static void secondTask() {
        //2 С клавиатуры вводятся: целые числа А и В выражающие объем информации  в мегабайтах.
        //Перевести А в байты,  В  в гигабайты. Найти их сумму в килобайтах.
        System.out.println("\nВторое задание\nВведите числов A в мегабайтах: ");
        int A = scanner.nextInt();
        System.out.println("\nВведите числов B в мегабайтах:\"");
        int B = scanner.nextInt();

        double GBytes = (double) A / 1024;
        double KBytes = B * 1024 * 1024;
        System.out.println(A + " мегабайт = " + GBytes + " гигабайт");
        System.out.println(B + " мегабайт = " + KBytes + " килобайт");
    }

    public static void sixthTask() {
        //6 С клавиатуры вводится сторона равностороннего треугольника А.
        //Вычислить радиус вписанной r и описанной R окружностей этого треугольника.
        System.out.println("\nТретье задание\nВведите сторону треугольника A:");
        int A = scanner.nextInt();

        double r = (A * Math.sqrt(3)) / 6;
        double R = (A * Math.sqrt(3)) / 3;
        System.out.println("Радиус r вписанной окружности: " + r);
        System.out.println("Радиус r вписанной окружности: " + R);
    }

    public static void sixteenthTask() {
        //16 С клавиатуры вводится радиус вписанной в квадрат  окружности  r.
        // Вычислить сторону квадрата А и радиус описанной окружности квадрата R.
        System.out.println("\nЧетвертое задание\nВведите радиус вписанной в квадрат окружности r:");
        double r = scanner.nextDouble();

        double A = r * 2;
        double R = A / Math.sqrt(2);

        System.out.println("Сторона квадрата A = " + A);
        System.out.println("Радиус описанной окружности квадрата R = " + R);
    }
}