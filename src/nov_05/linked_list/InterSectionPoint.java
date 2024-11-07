package nov_05.linked_list;

class Node {
    int data;
    Nodes next;
    Node(int val) {
        data = val;
        next = null;
    }
}


class TUF{
    //utility function to insert node at the end of the linked list
    static Nodes insertNode(Nodes head, int val) {
        Nodes newNodes = new Nodes(val);

        if(head == null) {
            head = newNodes;
            return head;
        }

        Nodes temp = head;
        while(temp.next != null) temp = temp.next;

        temp.next = newNodes;
        return head;
    }
    //utility function to check presence of intersection
    static Nodes intersectionPresent(Nodes head1, Nodes head2) {
        Nodes d1 = head1;
        Nodes d2 = head2;

        while(d1 != d2) {
            d1 = d1 == null? head2:d1.next;
            d2 = d2 == null? head1:d2.next;
        }

        return d1;
    }

    //utility function to print linked list created
    static void printList(Nodes head) {
        while(head.next != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String args[]) {
        // creation of both lists
        Nodes head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);
        Nodes head1 = head;
        head = head.next.next.next;
        Nodes headSec = null;
        headSec=insertNode(headSec,3);
        Nodes head2 = headSec;
        headSec.next = head;
        //printing of the lists
        System.out.print("List1: "); printList(head1);
        System.out.print("List2: "); printList(head2);
        //checking if intersection is present
        Nodes answerNodes = intersectionPresent(head1,head2);
        if(answerNodes == null)
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is "+ answerNodes.data);

    }
}