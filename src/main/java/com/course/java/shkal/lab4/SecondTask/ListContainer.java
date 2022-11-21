package com.course.java.shkal.lab4.SecondTask;

import java.util.Arrays;
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

    public ListContainer(T... values) {
        elements = new Object[values.length];
        for (int i = 0; i < values.length; i++) {
            elements[i] = values[i];
            index++;
        }
        size = index;
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

    public boolean add(T t) {
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

    public boolean addAll(ListContainer list) {
        for (int i = 0; i < list.size(); i ++){
            this.add((T) list.get(i));
        }
        return true;
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
                k--;
            } else {
                temp[k] = elements[i];
            }
        }

        elements = temp;
        size--;
        this.index--;
        return true;
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

    public ListContainer<T> subList(int firstIndex, int lastIndex) {
        indexCheck(firstIndex);
        indexCheck(lastIndex);

        SubList<T> temp = new SubList<T>(this, 0, firstIndex, lastIndex);
        return temp;
    }

    @Override
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
        ListContainer<?> arrayList = (ListContainer<?>) o;
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

class SubList<T> extends ListContainer {
    Object[] elements;
    private ListContainer parent;
    private int offset;
    int size;

    SubList(ListContainer parent, int offset, int fromIndex, int toIndex) {
        this.parent = parent;
        this.offset = offset + fromIndex;
        this.size = toIndex - fromIndex;

        elements = new Object[toIndex - fromIndex];
        for (int i = fromIndex, k = 0; i < toIndex; i++, k++) {
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
