class Solution
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int maxcount=0;
        int currcount=0;
        for(int num:nums)
        {
           if(num ==1)
           {
            currcount++;
            maxcount=Math.max(maxcount,currcount);
           }
           else
           {
            currcount=0;
           }
        }
        return maxcount;
    }
}