package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
//    // Press Alt+Enter with your caret at the highlighted text to see how
//    // IntelliJ IDEA suggests fixing it.
//    System.out.printf("Hello and welcome!");
//
//    // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//    for (int i = 1; i <= 5; i++) {
//
//      // Press Shift+F9 to start debugging your code. We have set one breakpoint
//      // for you, but you can always add more by pressing Ctrl+F8.
//      System.out.println("i = " + i);
    Solution5 solution = new Solution5();

    // 示例1
    int[] nums1 = {3, 5, 6, 7};
    int target1 = 9;
    System.out.println(solution.numSubseq(nums1, target1)); // 输出: 4

    // 示例2
    int[] nums2 = {3, 3, 6, 8};
    int target2 = 10;
    System.out.println(solution.numSubseq(nums2, target2)); // 输出: 6

    // 示例3
    int[] nums3 = {2, 3, 3, 4, 6, 7};
    int target3 = 12;
    System.out.println(solution.numSubseq(nums3, target3)); // 输出: 61

  }
}
