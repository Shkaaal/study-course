package com.course.java.shkal.lab4.SecondTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListContainer<ArrayList<String>> listContainer1 = new ListContainer<>();
        ListContainer<ArrayList<String>> listContainer2 = new ListContainer<>();

        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<String> secondList = new ArrayList<>();
        ArrayList<String> thirdList = new ArrayList<>();

        firstList.add("asd");
        firstList.add("sad");
        firstList.add("qwe");
        firstList.add("zxc");

        secondList.add("yuu");
        secondList.add("kjl");
        secondList.add("bnm");
        secondList.add("bnm");

        thirdList.add("фвы");
        thirdList.add("чся");
        thirdList.add("авы");
        thirdList.add("уцк");

        ListContainer<List<String>> listContainer3 = new ListContainer<>(firstList, secondList);


        listContainer1.add(firstList);
        listContainer2.add(firstList);

        listContainer3.add(firstList);
        listContainer3.add(secondList);
        listContainer3.add(thirdList);

        System.out.println(listContainer1);
        System.out.println(listContainer2);
        System.out.println(listContainer3);


        System.out.println("\nМетод сравнения двух контейнеров:\n" + listContainer1.compareTo(listContainer2));


        System.out.println("\nlistContainer3:\n" + listContainer3);
        listContainer3.remove(0);
        System.out.println("\nМетод удаления элементов в контейнере:\n" + listContainer3);

        System.out.println("\nПоиск элементов по индексу = 1:\n" + listContainer3.get(1));

        System.out.println("\nПоиск элементов по значению = '[фвы, чся, авы, уцк]':\n" + listContainer3.get(thirdList));

        System.out.println("\nПолучение подсписка по индексам с 0 по 2:\n" + listContainer3.subList(0, 2));

        listContainer3.addAll(listContainer2);
        System.out.println("\nДобавление коллекции элементов:\n" + listContainer3);
    }
}