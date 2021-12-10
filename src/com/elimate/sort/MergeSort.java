package com.elimate.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8,0};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr){
        mergeSort(arr,0,arr.length - 1);
    }
    public static void mergeSort(int[] arr,int left,int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid + 1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int[] temp = new int[arr.length];
        int l = left;
        int r = mid + 1;
        int t = 0;
        while(l <= mid && r <= right){
            if(arr[l] < arr[r]) {
                temp[t++] = arr[l++];
            }else{
                temp[t++] = arr[r++];
            }
        }
        while(l <= mid){
            temp[t++] = arr[l++];
        }
        while(r <= right){
            temp[t++] = arr[r++];
        }
        for(int i = left; i <= right; i++){
            arr[i] = temp[i - left];
        }
    }
}
