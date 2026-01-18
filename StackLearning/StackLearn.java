package StackLearning;

import java.util.Stack;

public class StackLearn {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(32);
        stack.push(31);
        stack.push(30);
        stack.push(39);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
