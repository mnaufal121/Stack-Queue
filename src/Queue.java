
//import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
class Link {

    public int dData;
    public Link next;

    public Link(int d) {
        dData = d;
    }

    public void displayLink() {
        System.out.println(dData + " ");
    }
}

class FirstLastList {

    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(int dd) {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;

    }

    public int deleteFirst() {
        int temp = first.dData;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.print("");
    }

    public int peek() {
        return first.dData;
    }
}

class LinkQueue {

    private final FirstLastList theList;
    private int size;

    public LinkQueue() {
        this.theList = new FirstLastList();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void enqueue(int j) {
        theList.insertLast(j);
        size++;
    }

    public int dequeue() {
        size--;
        return theList.deleteFirst();
    }

    public void displayQueue() {
        System.out.print("Queue (Head to Tail) : \n");
        theList.displayList();
    }

    public int peekQ() {
        return theList.peek();
    }

    public int size() {
        return size;
    }
}

public class Queue {

    public static void main(String[] args) {
        LinkQueue coba = new LinkQueue();
        System.out.println(coba.isEmpty());
        coba.enqueue(10);
        coba.enqueue(5);
        coba.enqueue(15);
        coba.displayQueue();
        System.out.println("Head/first data : "+coba.peekQ());
        System.out.println("Ukuran Queue : "+coba.size()+"\n");

        System.out.println(coba.isEmpty());
        coba.enqueue(1);
        coba.enqueue(40);
        coba.dequeue();
        coba.displayQueue();
        System.out.println("Head/first data : "+coba.peekQ());
        System.out.println("Ukuran Queue : "+coba.size());
    }
}
