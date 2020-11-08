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

    public void deleteMiddle(Node node){
      Node tNode=head;
      if(head==node){
          node.data=null;
          if(node.next!=null){
              head=node.next;
          }
          else{
              head=null;
          }
          node.next=null;
          size--;
          return;
      }
      for(int i=1; i<size; i++){
          if(tNode.next==node){
              tNode.next=node.next;
              node.data=null;
              node.next=null;
              size--;
              break;
          }
          else{
              tNode=tNode.next;
          }
      }
    }

    public void deleteFirst(){
        if(head==null)
            return;
        Node node= head;
        node.data=null;
        if(head.next!=null)
            head=head.next;
        else {
            head = null;
            tail = null;
        }
        size--;

    }

    public void deleteLast(){
        Node node=head;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            for(int i=1; i<size-1; i++){
                node=node.next;
            }
            size--;
            node.next=null;
            tail=node;
        }
    }

    public void addMiddle(Node preNode, Object data){
        Node node = new Node(data);
        node.next=preNode.next;
        preNode.next=node;
        size++;

    }

    public Node findNode(Object data){
        Node node=this.head;
        while(true){
            if(node.getData()==data){
                return node;
            }
            if(node.next==null){
                return null;
            }
            else{
                node=node.next;
            }
        }
    }

    public void printAll(){
        Node node = head;
        while(true){
            System.out.println(node.getData().toString());
            if(node.next==null)
                break;
            node=node.next;
        }

    }
}
