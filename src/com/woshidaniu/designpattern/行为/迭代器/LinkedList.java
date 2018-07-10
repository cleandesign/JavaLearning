package com.woshidaniu.designpattern.行为.迭代器;

import java.util.Iterator;

/**
 * Created by kang on 2018/7/8.
 */
public class LinkedList<E> implements Iterable<E>{

    private Entry<E> header = new Entry<E>(null, null, null);
    private int size;

    public LinkedList() {
        header.next = header.previous = header;
    }

    public void add(E e){
        Entry<E> newEntry = new Entry<E>(e, header, header.next);
        newEntry.previous.next = newEntry;
        newEntry.next.previous = newEntry;
        size++;
    }

    public int size(){
        return size;
    }

    public Object[] toArray(){
        Object[] result = new Object[size];
        int i = size - 1;
        for (Entry<E> e = header.next; e != header; e = e.next)
            result[i--] = e.value;
        return result;
    }

    private static class Entry<E>{
        E value;
        Entry<E> previous;
        Entry<E> next;
        public Entry(E value, Entry<E> previous, Entry<E> next) {
            super();
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }

    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {

        Entry<E> current = header;

        public boolean hasNext() {
            return current.previous != header;
        }

        public E next() {
            E e = current.previous.value;
            current = current.previous;
            return e;
        }

        public void remove() {

        }

    }

}