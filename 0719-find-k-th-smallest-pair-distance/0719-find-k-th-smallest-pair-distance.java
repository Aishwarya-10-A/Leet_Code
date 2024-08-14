import java.util.Arrays;

class Solution
{
    public int smallestDistancePair(int[] nums, int k)
    {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];
        while (left < right)
        {
            int mid = left + (right - left) / 2;
            if (countPairs(nums, mid) < k)
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
        }
        
        return left;
    }
    
    private int countPairs(int[] nums, int maxDist) {
        int count = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            while (nums[right] - nums[left] > maxDist) {
                left++;
            }
            count += right - left;
        }
        
        return count;
    }
}
