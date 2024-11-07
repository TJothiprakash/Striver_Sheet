/*
package nov_06.linked_list;

import java.util.HashMap;

// Node class to represent
// elements in the linked list
class Nodes {
    // Data stored in the node
    int data;
    // Pointer to the next node
    Nodes next;
    // Pointer to a random node in the list
    Nodes random;

    // Constructors for Node class
    Nodes() {
        this.data = 0;
        this.next = null;
        this.random = null;
    }

    Nodes(int x) {
        this.data = x;
        this.next = null;
        this.random = null;
    }

    Nodes(int x, Nodes nextNodes, Nodes randomNode) {
        this.data = x;
        this.next = nextNodes;
        this.random = randomNode;
    }
}

public class Main {
    // Function to clone the linked list
    public static Nodes cloneLL(Nodes head) {
        Nodes temp = head;
        // Create a HashMap to map original nodes
        // to their corresponding copied nodes
        HashMap<Nodes, Nodes> map = new HashMap<>();

        // Step 1: Create copies of each
        // node and store them in the map
        while (temp != null) {
            // Create a new node with the
            // same data as the original node
            Nodes newNodes = new Nodes(temp.data);
            // Map the original node to its
            // corresponding copied node in the map
            map.put(temp, newNodes);
            // Move to the next node in the original list
            temp = temp.next;
        }

        temp = head;
        // Step 2: Connect the next and random
        // pointers of the copied nodes using the map
        while (temp != null) {
            // Access the copied node corresponding
            // to the current original node
            Nodes copyNodes = map.get(temp);
            // Set the next pointer of the copied node
            // to the copied node mapped to the
            // next node in the original list
            copyNodes.next = map.get(temp.next);
            // Set the random pointer of the copied node
            // to the copied node mapped to the
            // random node in the original list
            copyNodes.random = map.get(temp.random);
            // Move to the next node in the original list
            temp = temp.next;
        }

        // Return the head of the
        // deep copied list from the map
        return map.get(head);
    }

    // Function to print the cloned linked list
    public static void printClonedLinkedList(Nodes head) {
        while (head != null) {
            System.out.print("Data: " + head.data);
            if (head.random != null) {
                System.out.print(", Random: " + head.random.data);
            } else {
                System.out.print(", Random: nullptr");
            }
            System.out.println();
            // Move to the next node in the list
            head = head.next;
        }
    }

    // Main function
    public static void main(String[] args) {
        // Example linked list: 7 -> 14 -> 21 -> 28
        Nodes head = new Nodes(7);
        head.next = new Nodes(14);
        head.next.next = new Nodes(21);
        head.next.next.next = new Nodes(28);

        // Assigning random pointers
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;

        System.out.println("Original Linked List with Random Pointers:");
        printClonedLinkedList(head);

        // Clone the linked list
        Nodes clonedList = cloneLL(head);

        System.out.println("\nCloned Linked List with Random Pointers:");
        printClonedLinkedList(clonedList);
    }
}
                                
                            */
