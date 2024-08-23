class Solution
{
    public int missingNumber(int[] nums)
    {
       int n=nums.length;
       int tsum=n*(n+1)/2;
       int asum=0;
       for(int num:nums)
       {
           asum+=num;
       }
       return tsum-asum;
        
    }
}




/*int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums)
        {
            actualSum += num;
        }
        
        return expectedSum - actualSum;*/


