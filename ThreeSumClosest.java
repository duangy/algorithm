import java.sql.Array;
import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int k = i + 1;
            int j = n - 1;
            while (k < j) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == target) return target;

                // 不能直接使用sum < best判断，负数是反方向
                if (Math.abs(sum - target) < Math.abs(best - target)) best = sum;

                if (sum > target) {
                    while (nums[j] == nums[--j] && k < j) {
                        continue;
                    }
                } else {
                    while (nums[k] == nums[++k] && k < j) {
                        continue;
                    }
                }
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        System.out.println(threeSumClosest(nums, -2));
    }
}

