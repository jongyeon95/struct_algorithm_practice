package com.company;

import com.company.sorts.BubbleSort;
import com.company.sorts.InsertSort;
import com.company.sorts.QuickSort;
import com.company.sorts.SelectionSort;
import com.company.structs.LinkedList;
import com.company.test.LinkedListTest;
import com.company.test.StackTest;

public class Main {

    public static void main(String[] args) {
        int arr[]={9,7,4,3,5,2,1,6,8};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.println(num);
        }
    }
}
