class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
        int value = -1;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
                map.put(nums[i],i);
        }
        for(j=0;j<nums.length;j++)
        {
            if(map.containsKey(target-nums[j]))
            {   
                value = map.get(target-nums[j]);
                if(value==j)
                    continue;
                return new int []{j,value};  
            }    
        }
        return new int []{};
    }
}
