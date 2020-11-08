package com.company.structs;

public class Stack {
    private Node top;
    private int size;

    static class Node{
        private Object data;
        private Node pre;

        public Node(Object data){
            this.data = data;
            this.pre=  null;
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
        if(top==null){
            top=node;
        }
        else{
            node.pre=top;
            top=node;
        }
        size++;
    }
    public void pop(){
        if(top==null)
            return;
        else{
            size--;
            System.out.println("pop "+top.getData().toString());
            top.data=null;
            top=top.pre;
        }

    }
    public void top(){
        System.out.println("front : "+top.getData().toString());
    }
    public int size(){
        return this.size;
    }
    public void printAll(){
        Node node=top;
        do{
            System.out.println(node.getData().toString());
            node=node.pre;
        }while (node!=null);
    }

}
