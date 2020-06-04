package Sort;

import LinkedList.Node;


public class BurbleLinkedList // Java program to sort a doubly linked list using


{



    // Function to print nodes in a given linked list
    static void printList( Node start)
    {
        Node temp = start;
        System.out.println();
        while (temp != null)
        {
            System.out.print( temp.data + " ");
            temp = temp.next;
        }
    }

    // Bubble sort the given linked list
    static Node bubbleSort( Node start)
    {
        int swapped, i;
        Node ptr1;
        Node lptr = null;

        // Checking for empty list
        if (start == null)
            return null;

        do
        {
            swapped = 0;
            ptr1 = start;

            while (ptr1.next != lptr)
            {
                if (ptr1.data > ptr1.next.data)
                {
                    int t = ptr1.data;
                    ptr1.data = ptr1.next.data;
                    ptr1.next.data = t;
                    swapped = 1;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
        }
        while (swapped != 0);
        return start;
    }

    // Driver code

}

