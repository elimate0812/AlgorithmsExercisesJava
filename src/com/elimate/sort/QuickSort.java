package com.elimate.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8,0};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length - 1);
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left < right){
            int temp = arr[left];
            int l = left;
            int r = right;
            while(l < r){
                while(l < r && temp <= arr[r]){
                    r --;
                }
                if(l < r){
                    arr[l] = arr[r];
                }
                while(l < r && temp >= arr[l]){
                    l ++;
                }
                if(l < r){
                    arr[r] = arr[l];
                }
            }
            arr[l] = temp;
            quickSort(arr,left,l - 1);
            quickSort(arr,l + 1,right);
        }
    }
}
