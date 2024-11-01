package hitwh;

/**
 * Hello world!
 *
 */
import java.util.Arrays;
class Solution5 {
  static final int P = 1000000007;
  static final int MAX_N = 100005;

  int[] f = new int[MAX_N];

  public int numSubseq(int[] nums, int target) {
    pretreatment();

    Arrays.sort(nums);

    int ans = 0;
    int n = nums.length;  // 存储数组长度
    for (int i = 0; i < n && nums[i] * 2 <= target; ++i) {
      int maxValue = target - nums[i];
      int pos = binarySearch(nums, maxValue) - 1;
      int contribute = (pos >= i) ? f[pos - i] : 0;
      ans = (ans + contribute) % P;  // 使用%而不是/
    }

    return ans;
  }

  public void pretreatment() {
    f[0] = 1;  // 修正：初始化f[0]为1
    for (int i = 1; i < MAX_N; ++i) {
      f[i] = (f[i - 1] << 1) % P;  // 左移操作的结果要取模
    }
  }

  public int binarySearch(int[] nums, int target) {
    int low = 0, high = nums.length - 1;  // 修正：high为nums.length - 1
    while (low <= high) {
      int mid = (high - low) / 2 + low;
      if (mid == nums.length) {
        return mid;
      }
      int num = nums[mid];
      if (num <= target) {
        low = mid + 1;
      } else {
        high = mid - 1;  // 修正：high更新为mid - 1
      }
    }
    return low;
  }
}

