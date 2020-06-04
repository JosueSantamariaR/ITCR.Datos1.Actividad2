package Sort;
import LinkedList.Node;

public class InsertionLinkedList
{
    Node sorted = null;

    void insertionSort(Node head)
    {
        Node current = head;

        while (current != null)
        {

            Node next = current.next;

            sortedInsert(current);

            current = next;
        }
    }

    void sortedInsert(Node newnode)
    {
        if (sorted == null || sorted.data >= newnode.data)
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            Node current = sorted;

            while (current.next != null && current.next.data < newnode.data)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }

    void printlist(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}
