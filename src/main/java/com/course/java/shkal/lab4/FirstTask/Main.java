package com.course.java.shkal.lab4.FirstTask;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList listInt = new ArrayList(2, 3, 4, 5, 6, 4);
        list.add("asd");
        list.add("wqe");
        list.add("zxc");
        list.add("dsa");
        list.add("fdg");

        ArrayList listToList = new ArrayList(list);

        System.out.println("Добавление элемента:\n" + list);
        System.out.println(listToList);
        System.out.println(listInt);

        list.add("rte");
        System.out.println("\nДобавление элемента:\n" + list);

        list.remove(0);
        System.out.println("\nУдаляем первый элемент:\n" + list);

        list.set(1, "test");
        System.out.println("\nЗаменяем второй элемент:\n" + list);

        System.out.println("\nПоиск элемента по индексу = 1:\n" + list.get(1));

        System.out.println("\nПоиск элемента по значению = 'test':\n" + list.get("test"));

        ArrayList subList = list.subList(1, 4);

        System.out.println("\nПодсписок с 1 по 4 индекс:\n" + subList);

        System.out.println("\nОтображение объекта в строку:\n" + list);
    }
}
