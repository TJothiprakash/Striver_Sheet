package nov_05.linked_list;


// Node class represents a
// node in a linked list
class Nodes {
    // Data stored in the node
    public int data;
    // Pointer to the next node in the list
    public Nodes next;

    // Constructor with both data
    // and next node as parameters
    public Nodes(int data, Nodes next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    public Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

 class Main {

    // Function to detect a loop in a linked list
    // using the Tortoise and Hare Algorithm
    public static boolean detectCycle(Nodes head) {
        // Initialize two pointers, slow and fast,
        // to the head of the linked list
        Nodes slow = head;
        Nodes fast = head;

        // Step 2: Traverse the linked list
        // with the slow and fast pointers
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;
            // Move fast two steps
            fast = fast.next.next;

            // Check if slow and fast pointers meet
            if (slow == fast) {
                return true;  // Loop detected
            }
        }

        // If fast reaches the end of the
        // list, there is no loop
        return false;
    }


    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        Nodes head = new Nodes(1);
        Nodes second = new Nodes(2);
        Nodes third = new Nodes(3);
        Nodes fourth = new Nodes(4);
        Nodes fifth = new Nodes(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        // Check if there is a loop
        // in the linked list
        if (detectCycle(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

        // No need to explicitly free memory
        // in Java; the garbage collector handles it
    }
}

