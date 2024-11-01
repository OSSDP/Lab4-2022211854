package hitwh;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution5Test {

  @Test
  public void testNumSubseq_ValidCase1() {
    Solution5 solution = new Solution5();
    int[] nums = {};
    int target = 9;
    assertEquals(4, solution.numSubseq(nums, target));
  }

  @Test
  public void testNumSubseq_ValidCase2() {
    Solution5 solution = new Solution5();
    int[] nums = {3, 3, 6, 8};
    int target = 10;
    assertEquals(6, solution.numSubseq(nums, target));
  }

  @Test
  public void testNumSubseq_ValidCase3() {
    Solution5 solution = new Solution5();
    int[] nums = {2, 3, 3, 4, 6, 7};
    int target = 12;
    assertEquals(61, solution.numSubseq(nums, target));
  }

  @Test
  public void testNumSubseq_EmptyArray() {
    Solution5 solution = new Solution5();
    int[] nums = {};
    int target = 5;
    assertEquals(0, solution.numSubseq(nums, target));
  }

  @Test
  public void testNumSubseq_NoValidSubsequence() {
    Solution5 solution = new Solution5();
    int[] nums = {10, 11};
    int target = 15;
    assertEquals(0, solution.numSubseq(nums, target));
  }
}
