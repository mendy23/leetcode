class Solution {
public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int index = 0;
        while (index < nums.length && nums[index] <= target) {
            if (nums[index] == target) {
                if (start == -1)
                    start = index;
            }
            index++;
        }
        if (start == -1) {
            return new int[] {-1, -1};
        } else {
            return new int[] {start, index - 1};
        }
    }
}