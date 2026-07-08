/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int i=0, j= list.size()-1;

        int sum = 0;
        while(i<j){
            int total = list.get(i) + list.get(j);
            sum = Math.max(total,sum);
            i++;
            j--;
        }

        return sum;
    }
}