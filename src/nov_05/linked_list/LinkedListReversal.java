package nov_05.linked_list;

public class LinkedListReversal {

    public static void main(String[] args) {
        Nodes head = new Nodes(1);
        Nodes second = new Nodes(2);
        Nodes third = new Nodes(3);
        Nodes fourth = new Nodes(4);
        Nodes fifth = new Nodes(5);
        Nodes sixth = new Nodes(6);
        Nodes seventh = new Nodes(7);
        Nodes eighth = new Nodes(8);
        Nodes ninth = new Nodes(9);
        Nodes tenth = new Nodes(10);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = ninth;
        ninth.next = tenth;

        int k = 3;

        head = reverseList(head, k); // Update head after reversal
        printList(head); // Expected output: 3 2 1 6 5 4 9 8 7 10
    }

    private static Nodes reverseList(Nodes head, int k) {
        if (head == null || k <= 1) return head;

        Nodes dummy = new Nodes(0);
        dummy.next = head;
        Nodes prevGroupEnd = dummy;

        while (true) {
            // Check if there are at least k nodes left to reverse
            Nodes kthNode = getKthNode(prevGroupEnd, k);
            if (kthNode == null) break;

            // Mark the start and end of the current group
            Nodes groupStart = prevGroupEnd.next;
            Nodes nextGroupStart = kthNode.next;

            // Reverse the k nodes in the current group
            reverseGroup(groupStart, k);

            // Connect the previous part with the reversed group
            prevGroupEnd.next = kthNode;
            groupStart.next = nextGroupStart;

            // Move prevGroupEnd to the end of the reversed group
            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }

    // Helper to get the k-th node from a starting node
    private static Nodes getKthNode(Nodes start, int k) {
        while (start != null && k > 0) {
            start = start.next;
            k--;
        }
        return start;
    }

    // Helper to reverse k nodes starting from head
    private static void reverseGroup(Nodes head, int k) {
        Nodes prev = null;
        Nodes curr = head;

        while (k > 0) {
            Nodes next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
    }

    private static void printList(Nodes head) {
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static int length(Nodes head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}
