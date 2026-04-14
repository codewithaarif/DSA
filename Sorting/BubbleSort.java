package Sorting;
public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = {7,8,3,1,2};

        // Bubble Sort
        for ( int i = 0; i <arr.length-1;i++){
            for ( int j = 0; j<arr.length-1-i;i++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
}