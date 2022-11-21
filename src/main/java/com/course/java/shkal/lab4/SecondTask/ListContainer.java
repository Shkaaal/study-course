package com.course.java.shkal.lab4.SecondTask;

import java.util.List;
import java.util.Objects;

public class ListContainer<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;
    private int index;

    public ListContainer() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ListContainer(T... elements) {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = elements[i];
        }
    }

//    public List<T> get(int index) {
//        indexCheck(index);
//        return  elements[]
//    }

    public boolean add(List list) {
        if (elements.length == index) {
            elements = (T[]) new Object[size * 2];
        }

        elements[index] = (T) list;
        index++;
        size++;
        return true;
    }

    private void indexCheck(int index) {
        if (index < 0 || index >= this.index) {
            throw new IllegalArgumentException();
        }
    }

    public String getAll() {
        String result = "";

        for (int i = 0; i < size; i++) {
            result += this.elements[i] + "\n";
        }

        return "List = {" + result + "}";
    }

    public boolean compareTo(ListContainer<T> listContainer) {
        if (this.size != listContainer.size) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (this.elements[i] != listContainer.elements[i]) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i] + " ";
        }
        return "List { " + result + "}";
    }

    public int hashCode() {
        return Objects.hash((Object) elements);
    }

    public boolean equals(Object o) {
        return false;
    }
}
