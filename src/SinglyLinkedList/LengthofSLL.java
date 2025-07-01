package SinglyLinkedList;

public class LengthofSLL {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data= data;
            this.next = null;
        }
    }

    public int display(){
        ListNode current = head;
        int lengthCount =0;
        while(current!=null){
            System.out.print(current.data+"---->");
            current = current.next;
            lengthCount++;
        }
        System.out.print("null");
        System.out.println();
        return lengthCount;

    }

    public static void main(String[] args) {
        LengthofSLL sll = new LengthofSLL();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(55);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println(sll.display());
    }
}
