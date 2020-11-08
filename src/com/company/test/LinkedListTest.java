package com.company.test;

import com.company.structs.LinkedList;

public class LinkedListTest {
        public void testLinkedList(){
            LinkedList list = new LinkedList();
            list.addFirst("Hello1");
            list.addLast("Hello3");
            list.addMiddle(list.findNode("Hello1"),"Hello2");
            list.printAll();
            System.out.println("====================");
            list.deleteFirst();
            list.printAll();
            System.out.println("====================");
            list.deleteLast();
            list.printAll();
            System.out.println("====================");
            list.addFirst("Hello1");
            list.addLast("Hello3");
            list.printAll();
            System.out.println("====================");
            list.deleteMiddle(list.findNode("Hello2"));
            list.printAll();
        }

}
