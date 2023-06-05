# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        finalListNode = None
        return Solution.mergeTwoListsRecursion(list1, list2, finalListNode)

    @staticmethod
    def mergeTwoListsRecursion(list1: Optional[ListNode], list2: Optional[ListNode], finalListNode: Optional[ListNode]) -> Optional[ListNode]:
        if list1 is None and list2 is None:
            return finalListNode
        elif list1 is None:
            finalListNode = ListNode(list2.val, Solution.mergeTwoListsRecursion(list1, list2.next, finalListNode));
            return finalListNode
        elif list2 is None:
            finalListNode = ListNode(list1.val, Solution.mergeTwoListsRecursion(list1.next, list2, finalListNode));
            return finalListNode
        elif list1.val > list2.val:
            finalListNode = ListNode(list2.val, Solution.mergeTwoListsRecursion(list1, list2.next, finalListNode));
            return finalListNode
        else:
            finalListNode = ListNode(list1.val, Solution.mergeTwoListsRecursion(list1.next, list2, finalListNode));
            return finalListNode