//Non-comparison sorting algorithm and good for smaller numbers
public class CountingSort {
    public static void countSort(int arr[]){
        if(arr==null || arr.length <= 1){
            return;
        }

        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        int countArr[] = new int[max+1];
        for(int num : arr){
            countArr[num]++;
        }
        int index = 0;
        for(int i = 0; i<=max; i++){
            while(countArr[i] > 0){
                arr[index] = i;
                index++;
                countArr[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 3, 8, 4};

        countSort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
