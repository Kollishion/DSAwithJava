import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        //Insertion sort
        //[2, 1, 7, 5, 3]
        for(int i = 1; i<n; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        //Print the array
        System.out.println("Sorted Array:");
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
