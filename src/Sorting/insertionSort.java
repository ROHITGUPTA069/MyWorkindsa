package Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {-2,-2,-5,-1,6,4,2};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void InsertionSort(int[] arr){
        for(int i = 0; i<arr.length -1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int []arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
