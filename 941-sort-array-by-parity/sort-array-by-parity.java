import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Comparator.comparingInt(a -> a % 2));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = boxed[i];
        }
        return nums;
    }
}