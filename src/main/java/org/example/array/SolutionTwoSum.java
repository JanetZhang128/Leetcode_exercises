package org.example.array;

import java.util.HashMap;

public class SolutionTwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the hashmap
            if (map.containsKey(complement)) {
                // Return the indices of the current element and the complement
                return new int[]{map.get(complement), i};
            }
            // Add the current element and its index to the hashmap
            map.put(nums[i], i);
        }
        // If no solution is found, return an empty array or null
        return new int[]{};
    }

    public static void main(String[] args) {
        SolutionTwoSum solution = new SolutionTwoSum();

        // Test cases
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Example 1 Output: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Example 2 Output: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Example 3 Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}