package com.company.test;

import com.company.structs.Queue;
import com.company.structs.Stack;

public class StackTest {
    public void testStack(){
        Stack s=new Stack();
        s.push("Hello1");
        s.push("Hello2");
        s.push("Hello3");
        s.pop();
        s.pop();
        s.pop();
        s.push("Hello1");
        s.push("Hello2");
        s.push("Hello3");
        s.printAll();
    }
}
