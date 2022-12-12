package com.course.java.shkal.lab5;

//Необходимо выполнить следующие задания на языке Java:
//1. Написать функциональный интерфейс с методом, который принимает
//число и возвращает булево значение. Написать реализацию такого интерфейса
//в виде лямбда-выражения, которое возвращает true если переданное число
//делится без остатка на 13.

public class FirstTask {
    public static void main(String[] args) {

        FirstTaskInterface foo1 = ((n) -> {
            if (n % 13 == 0) {
                return true;
            } else {
                return false;
            }
        });

        System.out.println(foo1.divisionOn13(100));
        System.out.println(foo1.divisionOn13(130));

    }
}

@FunctionalInterface
interface FirstTaskInterface {
    boolean divisionOn13(int n);
}
