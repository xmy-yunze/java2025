package node;

public class NodeTest {
    public static void main(String[] args) {
        ListNode n3 = new ListNode(3, null);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        NodeTest test = new NodeTest();
        test.visit(n1);
        test.visit(n1);
//        ListNode reverse = test.reverseFirstN(n1, 2);
//        test.visit(reverse);
    }

    public void visit(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println(node);
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    ListNode successor = null;

    public ListNode reverseFirstN(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode node = reverseFirstN(head.next, --n);
        head.next.next = head;
        head.next = successor;
        return node;
    }
}

