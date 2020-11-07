package com.company.structs;

public class LinkedList {
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

    public void addFirst(Object data){
        Node node=new Node(data);
        node.next=this.head;
        head=node;
        size++;
        if(head.next==null){
            tail=head;
        }
    }

    public void addLast(Object data){
        Node node=new Node(data);
        if(size==0){
            addFirst(data);
        }
        else{
            tail.next=node;
            tail=node;
            size++;
        }
    }

    public void addMiddle(Node preNode, Object data){
        Node node = new Node(data);
        node.next=preNode.next;
        preNode.next=node;
    }
}
