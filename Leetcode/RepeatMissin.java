//Brute force:
//TimeComplexity = O(n^4)
/*class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int repeating = -1, missing = -1;

        for (int num = 1; num <= size; num++) {   
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == num) {
                        count++;
                    }
                }
            }
            if (count == 0) missing = num;
            if (count == 2) repeating = num;
        }
        return new int[]{repeating, missing};
    }
}
 */
//Better approach
// class Solution {
//     public int[] findMissingAndRepeatedValues(int[][] grid) {
        // int n = grid.length;
        // int size = n * n;

        // int repeating = -1, missing = -1;
        // int[] hash = new int[size + 1];  

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         hash[grid[i][j]]++;
        //     }
        // }

        // for (int num = 1; num <= size; num++) {
        //     if (hash[num] == 0) missing = num;
        //     if (hash[num] == 2) repeating = num;
        // }

        // return new int[]{repeating, missing};
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         int[][] grid1 = {{1, 3}, {2, 2}};
//         int[] ans1 = sol.findMissingAndRepeatedValues(grid1);
//         System.out.println("[" + ans1[0] + ", " + ans1[1] + "]");

//         int[][] grid2 = {{9,1,7}, {8,9,2}, {3,4,6}};
//         int[] ans2 = sol.findMissingAndRepeatedValues(grid2);
//         System.out.println("[" + ans2[0] + ", " + ans2[1] + "]"); 
//     }
// }
/*
Formulas required:

1. Expected Sum of first k natural numbers:
   SN = (k * (k + 1)) / 2
   where k = n^2

2. Expected Sum of squares of first k natural numbers:
   S2N = (k * (k + 1) * (2k + 1)) / 6
   where k = n^2

3. Relations between repeating (x) and missing (y):
   val1 = S - SN           // x - y
   val2 = S2 - S2N         // x^2 - y^2 = (x - y)(x + y)

4. Derived equations:
   x + y = val2 / val1
   x     = (val1 + (val2 / val1)) / 2
   y     = x - val1
*/
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // S - SN = x - y
        // S2 - S2N = x^2 - y^2

        int n = grid.length;
        long size = (long) n * n;

        // Expected sum and sum of squares for 1..n^2
        long SN = (size * (size + 1)) / 2; 
        long S2N = (size * (size + 1) * (2 * size + 1)) / 6;

        long S = 0, S2 = 0;

        // Actual sum and sum of squares
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                S += grid[i][j];
                S2 += (long) grid[i][j] * grid[i][j];
            }
        }

        long val1 = S - SN;    // x - y
        long val2 = S2 - S2N;  // x^2 - y^2

        long xPlusy = val2 / val1;   // x + y
        long x = (val1 + xPlusy) / 2;
        long y = x - val1;

        return new int[]{(int) x, (int) y};
    }

    // Main method to test
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] grid1 = {{1, 3}, {2, 2}};
        int[] ans1 = sol.findMissingAndRepeatedValues(grid1);
        System.out.println("[" + ans1[0] + ", " + ans1[1] + "]"); // [2, 4]

        int[][] grid2 = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        int[] ans2 = sol.findMissingAndRepeatedValues(grid2);
        System.out.println("[" + ans2[0] + ", " + ans2[1] + "]"); // [9, 5]
    }
}


