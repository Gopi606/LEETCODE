import java.util.Arrays;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {

                    return new int[]{i, j};

                }

            }

        }

        return new int[]{-1, -1};

    }

    public static void main(String[] args) {

        int[] nums = {3,2,4};

        int target = 6;

        Solution obj = new Solution();

        System.out.println(Arrays.toString(obj.twoSum(nums,target)));

    }
}///jhgvkjgub