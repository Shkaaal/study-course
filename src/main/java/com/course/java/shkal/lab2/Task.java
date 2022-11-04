package com.course.java.shkal.lab2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 42, 0, -1, 23, 4, 50, 1, -2, 32, -3);
        int X = 2;

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        System.out.println("Число X = " + X);
        System.out.println("Полученный список:\n" + sortedList);
    }
}
