import java.util.Scanner;
public class SelectionSort {
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
        //Selection sort
        //[2, 1, 7, 5, 3]
        for(int i = 0; i<n-1; i++){
            int smallest = i;
            for(int j = i+1; j<n; j++){
                if(arr[smallest] > arr[j])
                    smallest = j;
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        //Print the array
        System.out.println("Sorted Array:");
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
