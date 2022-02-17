import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static boolean isPalindrome(ListNode head) {
        ListNode listNode = head;
        List<Integer> list = new ArrayList<>();

        while (true) {
            list.add(listNode.val);
            if (listNode.next == null) {
                break;
            } else {
                listNode = listNode.next;
            }
        }

        String s1 = (String) list.stream()
                .map(number -> String.valueOf(number))
                .collect(Collectors.joining(""));

        String s2 = new StringBuffer(s1).reverse().toString();

        if(s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(1))));
        System.out.println(isPalindrome(listNode));
    }
}
