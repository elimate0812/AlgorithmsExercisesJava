package com.elimate.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8,0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr){
        int p;
        for(int i = 1; i < arr.length; i ++){
            p = arr[i];
            for(int j = i - 1; j >= 0 ; j --){
                if(p < arr[j]){
                    arr[j + 1] = arr[j];
                    arr[j] = p;
                }
            }
        }
    }
}
