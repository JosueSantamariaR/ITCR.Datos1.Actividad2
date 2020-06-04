package Sort;

import LinkedList.Node;


public class SelectionLinkedList{
    public static Node swapNodes( Node head, Node currX,
                                  Node currY, Node prevY)
    {
        head = currY;
        prevY.next = currX;
        Node temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;
        return head;
    }

    public static Node recurSelectionSort(Node head)
    {
        if (head.next == null)
            return head;

        Node min = head;
        Node beforeMin = null;
        Node ptr;

        for (ptr = head; ptr.next != null; ptr = ptr.next)
        {

            if (ptr.next.data < min.data)
            {
                min = ptr.next;
                beforeMin = ptr;
            }
        }

        if (min != head)
            head = swapNodes(head, head, min, beforeMin);

        head.next = recurSelectionSort(head.next);
        return head;
    }

    public static Node sort(Node head)
    {
        if ((head) == null)
            return null;

        head = recurSelectionSort(head);
        return head;
    }

    public static void printList(Node head)
    {
        while (head != null)
        {
            System.out.print( head.data + " ");
            head = head.next;
        }
    }
}


