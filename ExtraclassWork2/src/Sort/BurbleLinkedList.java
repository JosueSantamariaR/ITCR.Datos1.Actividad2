package Sort;
import LinkedList.Node;

public class BurbleLinkedList


{

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

    static Node bubbleSort( Node start)
    {
        int swapped;
        Node pointer;
        Node lpointer = null;


        if (start == null)
            return null;

        do
        {
            swapped = 0;
            pointer = start;

            while (pointer.next != lpointer)
            {
                if (pointer.data > pointer.next.data)
                {
                    int t = pointer.data;
                    pointer.data = pointer.next.data;
                    pointer.next.data = t;
                    swapped = 1;
                }
                pointer = pointer.next;
            }
            lpointer = pointer;
        }
        while (swapped != 0);
        return start;
    }

}

