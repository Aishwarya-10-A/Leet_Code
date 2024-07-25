class Solution
{
    public int[] countBits(int n)
    {
        int r[]=new int[n+1];
        r[0]=0;
        for(int i=0;i<=n;i++)
        {
            int count=0, x=i;
            while(x>0)
            {
                count+=(x&1);
                x=x>>1;
            }
            r[i]=count;
        }
        return r;
    }
}