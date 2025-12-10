package Recursion;

import java.util.Arrays;

public class Nxt_Perm {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 5};
        int n = arr.length;

        // Step 1: Find pivot
        int piv = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                piv = i;
                break;
            }
        }

        // Step 2: If no pivot found, reverse to smallest permutation
        if (piv == -1) {
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            return;
        }

        // Step 3: Find the next greater element from right
        for (int i = n - 1; i > piv; i--) {
            if (arr[i] > arr[piv]) {
                swap(arr, i, piv);
                break;
            }
        }

        // Step 4: Reverse the suffix
        int i = piv + 1, j = n - 1;
        while (i < j) {
            swap(arr, i++, j--);
        }

        // Step 5: Output
        System.out.println(Arrays.toString(arr));
    }
}
