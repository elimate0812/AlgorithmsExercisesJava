package com.elimate.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8,0};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int[] arr){
        int min = 0;
        int flag = 0;
        int mid = 0;
        for(int i = 0; i < arr.length; i ++){
            min = arr[i];
            for(int j = i + 1; j < arr.length; j ++) {
                if (min > arr[j]) {
                    min = arr[j];
                    flag = j;
                }
            }
            mid = arr[i];
            arr[i] = min;
            arr[flag] = mid;
        }
    }
}
