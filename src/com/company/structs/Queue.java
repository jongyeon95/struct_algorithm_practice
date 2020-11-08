package com.company.structs;

public class Queue {
    private Node head;
    private Node tail;
    private int size;

    static class Node{
        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
            this.next=  null;
        }

        public String toString(){
            return "data = "+String.valueOf(this.data);
        }

        public Object getData(){
            return this.data;
        };

    }

    public void push(Object data){
        Node node= new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    public void pop(){
        if(head==null)
            return;
        else{
            size--;
            System.out.println("pop "+head.getData().toString());
            head.data=null;
            head=head.next;
        }

    }
    public void front(){
        System.out.println("front : "+head.getData().toString());
    }
    public int size(){
        return this.size;
    }
    public void printAll(){
        Node node=head;
        do{
            System.out.println(node.getData().toString());
            node=node.next;
        }while (node!=null);
    }
}
