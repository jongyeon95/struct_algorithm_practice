package com.company.test;

import com.company.structs.Queue;

public class QueueTest {
    public void testQueue(){
        Queue queue=new Queue();
        queue.push("Hello1");
        queue.push("Hello2");
        queue.push("Hello3");
        queue.pop();
        queue.pop();
        queue.pop();
        queue.push("Hello1");
        queue.push("Hello2");
        queue.push("Hello3");
        queue.printAll();
    }
}
