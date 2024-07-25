class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int length = nums.length;
        int[] answer = new int[length];
        int[] prefixProducts = new int[length];
        prefixProducts[0] = 1;
        for (int i = 1; i < length; i++)
        {
            prefixProducts[i] = prefixProducts[i - 1] * nums[i - 1];
        }
        int suffixProduct = 1;  
        for (int i = length - 1; i >= 0; i--)
        {
            answer[i] = prefixProducts[i] * suffixProduct;
            suffixProduct *= nums[i];
        }
        
        return answer;
    }
}
