class Solution {
    public int[] rearrangeArray(int[] nums)
    {
        List<Integer>positives=new ArrayList<>();
        List<Integer>negatives=new ArrayList<>();
        for(int num:nums)
        {
            if(num>0)
            {
                positives.add(num);
            }
            else
            {
                negatives.add(num);
            }
        }
        int result[]=new int[nums.length];
        int posindex=0,negindex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                result[i]=positives.get(posindex++);
            }
            else
            {
                result[i]=negatives.get(negindex++);
            }
        }
        return result;


       
    }
}