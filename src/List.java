public class List {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private static ListNode createNode(int value) {
        return new ListNode(value);
    }

    ;

    public static void main(String[] args) {
        int n = 3;
        int i = 1;
        ListNode head = createNode(i);
        ListNode temp = head;
        for (; i < n; i++) {
            ListNode node = createNode(i + 1);
            temp.next = node;
            temp = temp.next;
        }
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
