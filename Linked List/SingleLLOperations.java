public class SingleLLOperations {


    // Insert Node at any Position
    public static Node insertAtPosition(Node head,int pos){

        Node newNode = new Node(300);
        if(pos == 0){
            newNode.next = head;
            head = newNode;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    // Insert node at the last.
    public static Node insertAtLast(Node head){

        Node newNode = new Node(200);
        if(head == null){
            head = newNode;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = newNode;
        }
        return head;
    }

    // Insert Node at the First.
    public static Node insertAtFirst(Node head){

        Node newNode = new Node(100);
        if(head == null){
           head = newNode ;
        }else{
            newNode.next =head;
            head = newNode;
        }
        return head;
    }

    // Printing all the Nodes in the list.
    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");// Prinitng the vlaue of head node
            temp=temp.next;  // pointing the next node address
        }
    }

    
    public static void main(String[] args) {

        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(6);
        Node n4 = new Node(12);

        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        //head = insertAtFirst(head);
        //head = insertAtLast(head);
        head = insertAtPosition(head, 2);
        printLinkedList(head);
    }
}


class Node {
        int value;
        Node next;

    public Node (int value){
        this.value=value;
        this.next=null;
        }
    }

