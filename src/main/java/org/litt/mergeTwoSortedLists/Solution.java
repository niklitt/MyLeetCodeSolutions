package org.litt.mergeTwoSortedLists;

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
public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return mergeTwoLists(list1, list2, null);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2, ListNode finalListNode) {
        if(list1 == null && list2 == null) {
            return finalListNode;
        } else if(list1 == null) {
            finalListNode = new ListNode(list2.val, mergeTwoLists(list1, list2.next, finalListNode));
            return finalListNode;
        } else if(list2 == null) {
            finalListNode = new ListNode(list1.val, mergeTwoLists(list1.next, list2, finalListNode));
            return finalListNode;
        } else if(list1.val > list2.val) {
            finalListNode = new ListNode(list2.val, mergeTwoLists(list1, list2.next, finalListNode));
            return finalListNode;
        } else {
            finalListNode = new ListNode(list1.val, mergeTwoLists(list1.next, list2, finalListNode));
            return finalListNode;
        }
    }
}