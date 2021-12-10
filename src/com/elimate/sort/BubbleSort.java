package com.elimate.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for(int i = arr.length - 1; i > 0; i --){
            for(int j = 0; j < i; j ++){
                if(arr[j] > arr[j + 1]){
                    swap(j,arr);
                }
            }
        }
    }
    public static void swap(int i,int[] arr){
        int mid;
        mid = arr[i];
        arr[i]= arr[i+1];
        arr[i+1] = mid;
    }
}
