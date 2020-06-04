package Sort;

import LinkedList.DoubleLinkedList;
import LinkedList.Node;

public class Main {
    public static void main(String args[])
    {


        BurbleLinkedList b=new BurbleLinkedList();
        DoubleLinkedList d=new DoubleLinkedList();
        SelectionLinkedList s=new SelectionLinkedList();
        InsertionLinkedList list = new InsertionLinkedList();


        System.out.println("\nBurble ///////////////////////////////////////");
        Node start = null, start2=null , start3 = null;



        start=d.push1(start, 25);
        start=d.push1(start, 2);
        start=d.push1(start, 65);
        start=d.push1(start, 34);
        start=d.push1(start, 22);



        System.out.printf("\n Linked list before sorting ");
        b.printList(start);


        start = b.bubbleSort(start);


        System.out.printf("\n Linked list after sorting ");
        b.printList(start);


        System.out.println("\nInsertion ///////////////////////////////////////");


        start2 = d.push1(start2, 6);
        start2 = d.push1(start2, 4);
        start2 = d.push1(start2, 8);
        start2 = d.push1(start2, 12);
        start2 = d.push1(start2, 1);

        System.out.println("Linked List before Sorting..");
        list.printlist(start2);
        list.insertionSort(start2);
        System.out.println("\nLinkedList After sorting");
        list.printlist(start2);


        System.out.println("\nSelection ///////////////////////////////////////");



        start3 = d.push1(start3, 6);
        start3 = d.push1(start3, 4);
        start3 = d.push1(start3, 8);
        start3 = d.push1(start3, 12);
        start3 = d.push1(start3, 1);

        System.out.println( "\nLinked list before sorting:");
        s.printList(start3);


        start3 = s.sort(start3);

        System.out.print( "\nLinked list after sorting:");
        s.printList(start3);
        System.out.println("\n");
    }

    }

