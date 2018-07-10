package com.woshidaniu.designpattern.行为.迭代器;

import java.util.Iterator;

/**
 * Created by kang on 2018/7/8.
 */
public class ArrayList<E> implements Iterable<E>{

    private static final int INCREMENT = 10;

    private E[] array = (E[]) new Object[10];

    private int size;

    public void add(E e) {
        if (size < array.length) {
            array[size++] = e;
        } else {
            E[] copy = (E[]) new Object[array.length + INCREMENT];
            System.arraycopy(array, 0, copy, 0, size);
            copy[size++] = e;
            array = copy;
        }
    }

    public Object[] toArray() {
        Object[] copy = new Object[size];
        System.arraycopy(array, 0, copy, 0, size);
        return copy;
    }

    public int size() {
        return size;
    }

    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {

        int cursor = 0;

        public boolean hasNext() {
            return cursor != size();
        }

        public E next() {
            return array[cursor++];
        }

        public void remove() {

        }

    }
}