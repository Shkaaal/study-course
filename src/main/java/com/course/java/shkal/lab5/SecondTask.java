package com.course.java.shkal.lab5;

//Написать функциональный интерфейс с методом, который принимает
//две строки и возвращает тоже строку. Написать реализацию такого
//интерфейса в виде лямбды, которая возвращает ту строку, которая длиннее

public class SecondTask {
    public static void main(String[] args) {

        SecondTaskInterface foo = (st1, st2) -> {
            if (st1.length() > st2.length()) {
                return st1;
            } else {
                return st2;
            }
        };

        System.out.println(foo.strBigLength("zxc", "qwer"));
        System.out.println(foo.strBigLength("йцуфыв", "ячс"));
    }
}

interface SecondTaskInterface {
    String strBigLength(String st1, String st2);
}
