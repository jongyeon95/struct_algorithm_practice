package com.company;

import com.company.sorts.BubbleSort;
import com.company.structs.LinkedList;
import com.company.test.LinkedListTest;
import com.company.test.StackTest;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[]={9,8,7,6,5,4,3,2,1};
        bubbleSort.sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
