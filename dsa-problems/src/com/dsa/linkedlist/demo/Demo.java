package com.dsa.linkedlist.demo;

import com.dsa.linkedlist.SinglyLinkedList;

public class Demo {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();

        //System.out.println(list.delete(2));
        //list.display();
        //list.insertRec(88, 2);
        //list.display();

//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 65);
//
//        list.display();

//        CircularLinkedList list = new CircularLinkedList();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();
    }
}
