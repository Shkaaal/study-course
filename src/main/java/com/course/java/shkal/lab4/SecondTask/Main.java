package com.course.java.shkal.lab4.SecondTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ListContainer<ArrayList<String>> list = new ListContainer<>();
        ListContainer<ArrayList<String>> list2 = new ListContainer<>();

        System.out.println(list);

//        System.out.println(list.get(0));

        System.out.println("getALL : ");
        System.out.println(list.getAll());

        System.out.println(list.compareTo(list2));

//        System.out.println(list.hashCode());
    }
}
