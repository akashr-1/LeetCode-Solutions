class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        // Declare a hashmap
        // Subtract each element in the list from the 'target'
        // Store the difference as the key in the hashmap and original key as the hashmap item's value 
        unordered_map<int, int> hashMap;

        // Iterate through the 'nums' array
        for (int i=0; i<nums.size(); i++){

            int difference = target - nums[i];

            // Check if the value already exists in the hashmap
            if (hashMap.contains(nums[i])){
                 // If yes, return the value
               return { hashMap[nums[i]], i };
            }

            // Else, store the difference in the hashmap
            hashMap[difference] = i;
        }

        // Return an empty array if no two numbers equal target value (Not possible according the the condition)
        return {};
    }
};