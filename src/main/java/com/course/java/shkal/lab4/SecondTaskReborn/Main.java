package com.course.java.shkal.lab4.SecondTaskReborn;

public class Main {
    public static void main(String[] args) {
        ListContainer<String> list = new ListContainer<>();
        ListContainer<String> list2 = new ListContainer<>();
        ListContainer<Character> listInt = new ListContainer<>('p', 'r', 'i', 'v', 'e', 't');
        list.add("asf");
        list.add("zxc");
        list.add("cxv");
        list.add("qwe");
        list.add("sad");
        list.add("tre");

        list2.add("asf");
        list2.add("zxc");
        list2.add("cxv");
        list2.add("qwe");
        list2.add("sad");
        list2.add("tre");

        System.out.println(listInt);

        System.out.println(list);
        System.out.println(list2);
        System.out.println("\nМетод сравнения двух контейнеров:\n" + list.compareTo(list2));

        list.remove(2);
        System.out.println("\nМетод удаления элементов в контейнере:\n" + list);

        System.out.println("\nПоиск элементов по индексу = 2:\n" + list.get(2));

        System.out.println("\nПоиск элементов по значению = 'sad':\n" + list.get("sad"));

        System.out.println("\nПолучение подсписка по индексам с 1 по 4:\n" + list.subList(1, 4));

        list.addAll(list2);
        System.out.println("\nДобавление коллекции элементов:\n" + list);
    }
}