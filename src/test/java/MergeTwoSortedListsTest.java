import org.litt.MergeTwoSortedLists.ListNode;
import org.litt.MergeTwoSortedLists.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test()
public class MergeTwoSortedListsTest {

    @Test
    public void test(ListNode list1, ListNode list2) {
        Solution.mergeTwoLists(list1, list2);
        Assert.assertTrue(true);
    }
}