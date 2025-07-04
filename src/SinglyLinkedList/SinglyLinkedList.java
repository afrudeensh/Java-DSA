package SinglyLinkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){this.data = data;this.next=null;
        }
    }

    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"--->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
        System.out.println();
    }
}


