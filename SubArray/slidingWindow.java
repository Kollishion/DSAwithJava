/*Sliding Window Technique
Sliding Window Technique is a method used to solve problems that involve subarray or substring or window.

The main idea is to use the results of previous window to do computations for the next window.
This technique is commonly used in algorithms like finding subarrays with a specific sum, finding the longest substring with unique characters, or solving problems that require a fixed-size window to process elements efficiently. (Source: GeekForGeeks)*/
public class slidingWindow{
    static int maxSum(int arr[], int n, int k){
        if(n<=k){
            System.out.println("Invalid");
            return -1;
        }
        int max_sum = 0;
        //sum of first window
        for(int i = 0; i<k; i++){
            max_sum += arr[i];
        }

        int window_sum = max_sum;
        for(int i = k; i<n; i++){
            window_sum += arr[i] - arr[i-k];
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
        
    }
}