package com.company;

import com.company.sorts.BubbleSort;
import com.company.sorts.SelectionSort;
import com.company.structs.LinkedList;
import com.company.test.LinkedListTest;
import com.company.test.StackTest;

public class Main {

    public static void main(String[] args) {
        int arr[]={9,7,4,3,5,2,1,6,8};
        SelectionSort selectionSort= new SelectionSort();
        selectionSort.sort(arr);
        for(int num : arr){
            System.out.println(num);
        }
    }
}
