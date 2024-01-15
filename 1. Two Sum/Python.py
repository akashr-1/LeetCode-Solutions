class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        # Declare a hashmap
        # Subtract each element in the list from the 'target'
        # Store the difference as the key in the hashmap and original key as the hashmap item's value 
        hashMap = {target - value: key for key, value in enumerate(nums)}

        # Iterate through the 'nums' array
        for index, value in enumerate(nums):

            # Check if the match is found and make sure that index is not the same
            if value in hashMap and index != hashMap[value]:
                # If yes, return the values
                return [index, hashMap[value]]

        # Return an empty array if no two numbers equal target value (Not possible according the the condition)
        return []
    