import java.util.Arrays;
public class choclateDist {
    public static int findMinDiff(int[] arr, int m){
        if(arr.length < m) return -1;
        Arrays.sort(arr);

        int min_diff = Integer.MAX_VALUE;

        for(int i = 0; i+m-1 < arr.length; i++){
            int diff = arr[i+m-1] - arr[i];
            min_diff = Math.min(min_diff, diff);
        }
        return min_diff;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 7, 9, 12, 56};
        int m = 3;
        System.out.println("The minimum difference is:"+findMinDiff(numbers, m));
    }
}
