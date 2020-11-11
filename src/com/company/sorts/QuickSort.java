package com.company.sorts;

public class QuickSort {
    public void sort(int arr[], int left, int right){
        if(left>=right){
            return;
        }
        int pivot=arr[left];
        int l=left+1;
        int r=right;
        while (l<r){
            while (r>left&&arr[r]>=pivot){
                r--;
            }
            while(l<=right&&arr[l]<=pivot){
                l++;
            }
            if(l>r){
                int temp=arr[r];
                arr[r]=pivot;
                arr[left]=temp;
            }
            else{
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }
        sort(arr,left,r-1);
        sort(arr,r+1,right);


    }
}
