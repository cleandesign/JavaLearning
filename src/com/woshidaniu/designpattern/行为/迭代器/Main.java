package com.woshidaniu.designpattern.行为.迭代器;

import java.util.Iterator;

/**
 * Created by kang on 2018/7/8.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i <= 11; i++) {
            arrayList.add(i);
        }
        System.out.println("arrayList size:" + arrayList.size());
        Iterator<Integer> arrayListIterator = arrayList.iterator();
        while(arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println("----------------------------------------------");

        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 1; i <= 11; i++) {
            hashSet.add(i);
        }
        System.out.println("hashSet size:" + hashSet.size());
        Iterator<Integer> hashSetIterator = hashSet.iterator();
        while(hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }

        System.out.println("----------------------------------------------");

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 1; i <= 11; i++) {
            linkedList.add(i);
        }
        System.out.println("linkedList size:" + linkedList.size());
        Iterator<Integer> LinkedListIterator = linkedList.iterator();
        while(LinkedListIterator.hasNext()) {
            System.out.println(LinkedListIterator.next());
        }
    }
}
