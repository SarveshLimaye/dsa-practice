package com.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail = head;
        }

        size+=1;

    }

    public void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }

    public void deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        tail=secondLast;
        tail.next=null;


        size--;
    }

    public void deleteIndex(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index == size -1){
            deleteLast();
            return;
        }
        Node temp = get(index-1);
        Node current = get(index);
        temp.next= current.next;
        size--;
    }

    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size+=1;
    }

    public void insertatIndex(int value,int index){
        if(index ==0){
            insertFirst(value);
        } else if(index == size){
            insertLast(value);
        }

        Node temp = head;
        for(int i = 1;i<index;i++){
            temp=temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next=node;
        size+=1;


    }

    public Node get(int index){
        Node temp = head;
        for (int i =0 ; i< index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }




    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(13);
        list.insertFirst(12);
        list.insertFirst(60);
        list.insertFirst(30);
        list.insertLast(50);
        list.insertatIndex(25,3);
        list.deleteFirst();
        list.deleteLast();
        list.deleteIndex(3);
        list.display();

    }
}
