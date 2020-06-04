package LinkedList;

public class DoubleLinkedList {





    public static Node push1(Node head_ref, int new_data)
    {

        Node new_node = new Node(new_data);


        new_node.data = new_data;


        new_node.next = (head_ref);


        (head_ref) = new_node;
        return head_ref;
    }
    public void getData(){
        
    }


    }


