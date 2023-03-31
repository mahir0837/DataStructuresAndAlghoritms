package com.sarac.LinkedListReview;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList=new LinkedList(4);
        myLinkedList.append(3);
        myLinkedList.append(5);
        myLinkedList.append(12);
        myLinkedList.preped(1);

        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        System.out.println("get index ="+myLinkedList.get(1).value);
        System.out.println(myLinkedList.set(1, 5));
        myLinkedList.insert(1,7);
        myLinkedList.remove(4);
        myLinkedList.remove(2);
        myLinkedList.reverse();
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
    }
}
