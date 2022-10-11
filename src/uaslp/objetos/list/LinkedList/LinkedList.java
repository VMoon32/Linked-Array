package uaslp.objetos.list.LinkedList;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
//Node y LinkedListIterator son inner class de LinkedList

public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int size;

    private static class Node{
        Node next;
        Node previous;
        String data;
        public Node(String data) {
            this.data = data;
        }
    }

    public class LinkedListIterator implements Iterator {

        private Node currentNode;

        public LinkedListIterator(){
            this.currentNode = head;
        }

        LinkedListIterator(Node startNode)
        {
            currentNode=startNode;
        }

        public boolean hasNext(){
            return currentNode != null;
        }

        public String next(){
            String data= currentNode.data;
            currentNode=currentNode.next;
            return data;
        }
    }


    public void addAtTail(String data)
    {
        Node node=new Node(data);

        //node.data=data;
        if(size==0)
        {
            head=node;
        }else{
            tail.next=node;
            node.previous=tail;
        }
        tail = node;
        size++;
    }

    public void addAtFront(String data)
    {
        Node node = new Node(data);

        if (size == 0) {
            tail = node;
        } else {
            head.previous = node;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void remove(int index){
        Node node = findNode(index);

        if(node == null){
            return;
        }
        if(size == 1){
            head = null;
            tail = null;
        } else if(node == head){
            head = node.next;
            if(head != null){
                head.previous = null;
            }
        } else if(node == tail){
            tail = node.previous;
            if(tail != null){
                tail.next = null;
            }
        } else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        size--;
    }

    public void removeAll(){
        head=null;
        tail=null;
        size=0;
    }

    public String getAt(int index)
    {
        Node node = findNode(index);

        return node == null ? null : node.data;
    }

    public void setAt(int index,String data){
        Node node = findNode(index);

        if(node != null){
            node.data = data;
        }
    }
    private Node findNode(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node node = head;
        int currentIndex = 0;
        while (currentIndex != index) {
            currentIndex++;
            node = node.next;
        }
        return node;
    }

    public void removeAllWithValue(String data){

    }


    public int getSize(){
        return size;
    }


    public LinkedListIterator getIterator(){
        return new LinkedListIterator();
    }
}



