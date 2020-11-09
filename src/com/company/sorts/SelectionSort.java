package com.company.sorts;

public class SelectionSort {
    public void sort(int arr[]){
        for (int i=0; i<arr.length; i++){
            int index=i;
            for (int j=i; j<arr.length; j++){
                if(arr[index]>arr[j]){
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
}
