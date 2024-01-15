class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Declare a hashmap
        // Subtract each element in the list from the 'target'
        // Store the difference as the key in the hashmap and original key as the hashmap item's value 
        Map<Integer, Integer> hashMap = new HashMap<>();      

        // Iterate through the 'nums' array
        for (int i=0; i<nums.length; i++){

            int difference = target - nums[i];

            // Check if the value already exists in the hashmap
            if (hashMap.get(nums[i]) != null && i != hashMap.get(nums[i])) {
                // If yes, return the value
                return new int[]{i, hashMap.get(nums[i])};
            }

            // Else, store the difference in the hashmap
            hashMap.put(difference, i);
        }

        // Return an empty array if no two numbers equal target value (Not possible according the the condition)
        return null;
    }
}