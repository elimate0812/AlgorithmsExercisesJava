package com.elimate.sort;

import com.elimate.tree.TreeNode;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8,0};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr){
        for(int i = arr.length/2 + 1; i >= 0; i --){
            shiftUp(arr,i,arr.length);
        }
        for(int i = arr.length - 1; i >= 0; i --){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            shiftUp(arr,0,i);
        }
    }
//  堆排序最为重要的步骤就是该步，堆排序总共分为两个部分，第一个部分是构造堆，第二个部分是将最大值后移后重新调整堆的结构,第一个部分利用shiftUp来构建初始堆
//  遍历半数元素，第二个部分是每次置换最大元素和最后一个元素，重新利用shiftUp调整队列满足原始堆的形式
    public static void shiftUp(int[] arr,int i,int n){
        int parent = i;
        int child = i * 2 + 1;
        while(child < n && child < arr.length){
            if(child + 1 < n && child + 1 < arr.length && arr[child] < arr[child + 1]){
                child ++;
            }
            if(arr[child] > arr[parent]){
                int temp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = temp;
                parent = child;
                child = 2 * parent + 1;
            }else{
                break;
            }
        }
    }
}
