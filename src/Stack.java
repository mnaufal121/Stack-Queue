
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Stack {

    private final int maxSize;
    private final char[] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

//    public boolean isEmpty() {
//        return (top == -1);
//    }
//
//    public boolean isFull() {
//        return (top == maxSize - 1);
//    }
    public String reverse(String input) {
        char[] in = input.toCharArray();
        int ukur = in.length;
        Stack arrStack = new Stack(ukur);
        for (int i = 0; i < ukur; i++) {
            arrStack.push(in[i]);
        }
        for (int i = 0; i < ukur; i++) {
            in[i] = arrStack.pop();
        }
        return String.valueOf(in);
    }
}

class driver {

    public static void main(String[] args) {
        String jawab;
        Scanner sc = new Scanner(System.in);
        Stack theStack = new Stack(10);
        do {
            System.out.print("Enter the Word : ");
            String in = sc.next();
//            Stack theStack = new Stack(in.length());
            System.out.println("Reverse the Word : " + theStack.reverse(in));
            System.out.print("Ingin mengulang (y/n): ");
            jawab = sc.next();
            System.out.println("");
        } while (jawab.compareToIgnoreCase("y") == 0);
    }
}
