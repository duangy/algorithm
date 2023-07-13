import java.util.Arrays;

public class TuoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for (int j = i +1; j < n; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i,j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(twoSum(nums, 9));
    }
}
