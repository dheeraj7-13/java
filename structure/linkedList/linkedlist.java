import java.util.*;

class Node<T> {
    T data;       // Data storage
    Node<T> next; // Reference to the next node

    // Constructor to initialize the node
public    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList<T> {
    Node<T> head; // Head of the list
    int size = 0; // Size of the linked list

    MyLinkedList() {
        this.head = null;
    }

    // Add a node at the end of the list
    void addNode(T data) {
        Node<T> temp = new Node<>(data); // Create a new node

        if (head == null) { // If the list is empty, add the first node
            head = temp;
            System.out.println("First node is added to the list");
        } else 
        {
            Node<T> current = head;
            // Traverse to the last node
            while (current.next != null) {
                current = current.next;
            }
            // Add the new node at the end
            current.next = temp;
            System.out.println("Node is added to the list");
        }
        size++; // Increment the size of the list
   
    }

    public String toString()
    {
        String res="[";
        Node <T> x=head;
        if(x==null)
        {
            res=res+"]";
        }
        while(x.next !=null)
        {
            res=res+String.valueOf(x.data)+"->";
            x=x.next;
        }
        res=res+ x.data +"null ]";
        return res;

    }

    // Method to print the list (for demonstration)
    void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class GenericLinkedList {
    public static void main(String[] args) {
        // Create a linked list
        MyLinkedList<Integer> l1 = new MyLinkedList<>();
        l1.addNode(10);
        l1.addNode(20);
        l1.addNode(30);
        l1.addNode(40);
        l1.addNode(50);

        // Print the list
        l1.printList();
    }
}
