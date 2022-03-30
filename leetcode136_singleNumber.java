// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.



class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for(int i=0;i<nums.length;i++)
        {
            x = x^nums[i];
        }
        return x;
    }
}



// Alternate Approach
// class Solution {
//     public int singleNumber(int[] nums) {
//         HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
//         for(int i=0;i<nums.length;i++)
//         {
//             if(map.containsKey(nums[i]))
//             {
//                 map.put(nums[i],map.get(nums[i])+1);
//             }
//             else
//                 map.put(nums[i],1);
//         }
//         return getKey(map,1);
        
//     }
    
    
    
//     public static <K, V> K getKey(Map<K, V> map, V value)
//     {
//         for (Map.Entry<K, V> entry: map.entrySet())
//         {
//             if (value.equals(entry.getValue())) {
//                 return entry.getKey();
//             }
//         }
//         return null;
//     }
// }
