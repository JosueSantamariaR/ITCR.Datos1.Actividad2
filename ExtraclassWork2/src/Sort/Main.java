package Sort;

import LinkedList.DoubleLinkedList;
import LinkedList.Node;

public class Main {
    public static void main(String args[])
    {

        Node start = null, start2=null , start3 = null;
        BurbleLinkedList b=new BurbleLinkedList();
        DoubleLinkedList d=new DoubleLinkedList();
        SelectionLinkedList s=new SelectionLinkedList();
        InsertionLinkedList list = new InsertionLinkedList();


        System.out.println("\n-----------------Burble-----------------");



        start=d.push1(start, 25);
        start=d.push1(start, 2);
        start=d.push1(start, 65);
        start=d.push1(start, 34);
        start=d.push1(start, 22);
        System.out.printf("\nLinked list before sorting: ");
        b.printList(start);
        start = b.bubbleSort(start);
        System.out.printf("\nLinked list after sorting: ");
        b.printList(start);
        System.out.println("\n");



        System.out.println("\n-----------------Insertion-----------------");



        start2 = d.push1(start2, 6);
        start2 = d.push1(start2, 4);
        start2 = d.push1(start2, 8);
        start2 = d.push1(start2, 12);
        start2 = d.push1(start2, 1);
        System.out.println("\nLinked List before Sorting: ");
        list.printlist(start2);
        list.insertionSort(start2);
        System.out.println("\nLinkedList After sorting: ");
        list.printlist(start2);
        System.out.println("\n");


        System.out.println("\n-----------------Selection-----------------");



        start3 = d.push1(start3, 6);
        start3 = d.push1(start3, 4);
        start3 = d.push1(start3, 8);
        start3 = d.push1(start3, 12);
        start3 = d.push1(start3, 1);
        System.out.println( "\nLinked list before sorting:");
        s.printList(start3);
        start3 = s.sort(start3);
        System.out.print( "\nLinked list after sorting: \n");
        s.printList(start3);
        System.out.println("\n");
    }

    }

