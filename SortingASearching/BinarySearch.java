public class BinarySearch {
    public static int binarySearch(int numbers[], int numberToFind){
        int low = 0;
        int high = numbers.length;
        //If loop ends, and condition is not fulfilled, we return -1 as we didn't find the element
        while(low<=high){
            int mid = low + (high - low) / 2;
            int midElement = numbers[mid];
            //Search
            if(numberToFind == midElement){
                return mid;
            }
            if(numberToFind < midElement){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7, 9};

        System.out.println(binarySearch(arr, 8));
    }
}
