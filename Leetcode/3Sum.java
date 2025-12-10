//Brute force from leetcode
//O(n^3) time complexity and O(n) space complexity
// import java.util.*;

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>(); 
        
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 for (int k = j + 1; k < nums.length; k++) {
//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
//                         Collections.sort(triplet);
//                         set.add(triplet); 
//                     }
//                 }
//             }
//         }
        
//         return new ArrayList<>(set);
//     }
// }
//Better approach
//O(n^2) time complexity and O(n) space complexity
// import java.util.*;

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> result = new HashSet<>();
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             Set<Integer> seen = new HashSet<>();
//             for (int j = i + 1; j < n; j++) {
//                 int complement = - (nums[i] + nums[j]);
//                 if (seen.contains(complement)) {
//                     List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
//                     Collections.sort(triplet);
//                     result.add(triplet);
//                 }
//                 seen.add(nums[j]);
//             }
//         }

//         return new ArrayList<>(result);
//     }
// }
