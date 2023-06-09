import org.litt.MergeTwoSortedLists.ListNode;
import org.litt.MergeTwoSortedLists.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoListsEasy() {
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4))); // 1, 2, 4
        System.out.println("list1 is: " + list1);
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4))); // 1, 3, 4
        System.out.println("list2 is: " + list2);
        ListNode actual = Solution.mergeTwoLists(list1, list2);
        System.out.println("actual is: " + actual);
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(4)))))); // 1, 1, 2, 3, 4, 4
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual,expected);
    }
}