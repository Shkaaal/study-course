package com.course.java.shkal.lab4.List.FirstTask;

public class ArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;
    private int index;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public ArrayList(ArrayList<T> list) {
        elements = new Object[list.size];
        size = list.size;
        index = list.index;
    }

    @SafeVarargs
    public ArrayList(T... values) {
        for (int i = 0; i < values.length; i++) {
            elements[i] = values[i];
        }
    }

    public boolean add(T t) {
        if (elements.length == index) {
            elements = new Object[size * 2];
        }

        elements[index] = t;
        index++;
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        indexCheck(index);
        return (T) elements[index];
    }

    public int get(T t) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == t)
                return i;
        }
        return -1;
    }

    private void indexCheck(int index) {
        if (index < 0 || index >= this.index) {
            throw new IllegalArgumentException();
        }
    }

    public boolean remove(int index) {
        indexCheck(index);

        Object[] temp = new Object[elements.length];
        for (int i = 0, k = 0; i < size; i++, k++) {
            if (index == i) {
                temp[i] = elements[k + 1];
                k++;
            } else {
                temp[i] = elements[k];
            }
        }

        elements = temp;
        size--;
        this.index--;
        return true;
    }

    public void set(int index, T value) {
        indexCheck(index);
        elements[index] = value;
    }

    public ArrayList<T> subList(int firstIndex, int lastIndex) {
        indexCheck(firstIndex);
        indexCheck(lastIndex);

        SubList<T> temp = new SubList<T>(this, 0, firstIndex, lastIndex);
        return temp;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i] + " ";
        }
        return "List { " + result + "}";
    }
}


class SubList<T> extends ArrayList<T> {
    private ArrayList<T> parent;
    private int offset;
    int size;

    SubList(ArrayList<T> parent, int offset, int fromIndex, int toIndex) {
        this.parent = parent;
        this.offset = offset + fromIndex;
        this.size = toIndex - fromIndex;
    }

    public T get(int index) {
        indexCheck(index);
        return parent.get(index + offset);
    }

    public int size() {
        return this.size;
    }

    private void indexCheck(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException();
        }
    }
}