package com.course.java.shkal.lab4.FirstTask;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList {
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

    public ArrayList(ArrayList list) {
        elements = new Object[list.size];
        size = list.size;
        index = list.index;

        for (int i = 0; i < size; i++) {
            this.elements[i] = list.elements[i];
        }
    }

    public ArrayList(Integer... values) {
        elements = new Object[values.length];
        for (int i = 0; i < values.length; i++) {
            elements[i] = values[i];
            index++;
        }
        size = index;
    }

    public boolean add(Object t) {
        if (elements.length  == index) {
            Object[] temp = new Object[size * 2];

            for (int i = 0; i < size; i++) {
                temp[i] = elements[i];
            }

            elements = temp;
        }

        elements[index] = t;
        index++;
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        indexCheck(index);
        return (Object) elements[index];
    }

    public int get(Object t) {
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

    public void set(int index, Object value) {
        indexCheck(index);
        elements[index] = value;
    }

    public ArrayList subList(int firstIndex, int lastIndex) {
        indexCheck(firstIndex);
        indexCheck(lastIndex);

        SubList temp = new SubList(this, 0, firstIndex, lastIndex);
        return temp;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i] + " ";
        }
        return "List { " + result + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayList arrayList = (ArrayList) o;
        if (size == arrayList.size) {
            for (int i = 0; i < size; i++) {
                if (!elements.equals(arrayList.elements)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }
}

class SubList extends ArrayList {
    Object[] elements;
    private ArrayList parent;
    private int offset;
    int size;

    SubList(ArrayList parent, int offset, int fromIndex, int toIndex) {
        this.parent = parent;
        this.offset = offset + fromIndex;
        this.size = toIndex - fromIndex;

        elements = new Object[toIndex-fromIndex];
        for (int i = fromIndex, k = 0; i < toIndex; i ++, k ++) {
            elements[k] = parent.get(i);
        }
    }

    public Object get(int index) {
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

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i] + " ";
        }
        return "List { " + result + "}";
    }
}