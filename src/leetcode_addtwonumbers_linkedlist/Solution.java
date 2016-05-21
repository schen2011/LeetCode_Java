package leetcode_addtwonumbers_linkedlist;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        
        ListNode l1current = l1;
        ListNode l2current = l2;
        ListNode newnode = new ListNode(0);
        ListNode p = newnode;
        int carryover = 0;
        
        while (l1current != null && l2current != null){
            int newval = l1current.val + l2current.val + carryover;
            if (newval >= 10){
                int valn = newval % 10;
                carryover = newval / 10;
                if (p == null){
                    p = new ListNode(valn);
                }
                else{
                    p.next = new ListNode(valn);
                }
            }
            else{
                carryover = 0;
                if (p == null)
                    p = new ListNode(newval);
                else
                    p.next = new ListNode(newval);
            }
            l1current = l1current.next;
            l2current = l2current.next;
            p = p.next;
        }
        
        if (l1current != null){
            while (l1current != null){
                int newnum = l1current.val+ carryover;
                if (newnum >= 10){
                    int valn = newnum % 10;
                    carryover = newnum / 10;
                    p.next = new ListNode(valn);
                }
                else{
                    p.next = new ListNode(newnum);
                    carryover = 0;
                }
                l1current = l1current.next;
                p = p.next;
                
            }
        }
        
        if (l2current != null){
            while (l2current != null){
                int newnum = l2current.val+ carryover;
                if (newnum >= 10){
                    int valn = newnum % 10;
                    carryover = newnum / 10;
                    p.next = new ListNode(valn);
                }
                else{
                    p.next = new ListNode(newnum);
                    carryover = 0;
                }
                l2current = l2current.next;
                p = p.next;
            }
        }
        
        if (l1current == null && l2current == null && carryover > 0){
            p.next = new ListNode(carryover);
        }
        
        ListNode t = newnode.next;
        return t;
    }
}
