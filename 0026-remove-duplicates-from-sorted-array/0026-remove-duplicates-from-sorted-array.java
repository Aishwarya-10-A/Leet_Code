import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : nums)
        {
            set.add(num);
        }
        int count = 0;
        for (int num : set)
        {
            nums[count++] = num;
        }
        
        return set.size(); // Number of unique elements
    }
}
