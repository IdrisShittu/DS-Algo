import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        Integer[] boxedArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        
        Arrays.sort(boxedArray, Comparator.comparingInt(a -> a % 2));
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = boxedArray[i];
        }

        return nums;
    }
}