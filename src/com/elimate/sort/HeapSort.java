package com.elimate.sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8,0};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr){
        for(int i = arr.length - 1; i > 0; i --){
            shiftUp(arr,i);
        }
    }

    public static void shiftUp(int[] arr,int i){
        int parent = i;
        int child = i * 2 + 1;
        int n = arr.length - 1;
        int temp = arr[parent];
        while(child < n){
            if(child + 1 < n && arr[child] < arr[child + 1]){
                child ++;
            }
            if(arr[child] > arr[parent]){
                arr[parent] = arr[child];
                parent = child;
                child = 2 * parent + 1;
            }else{
                break;
            }
        }
        arr[parent] = temp;
    }
}
