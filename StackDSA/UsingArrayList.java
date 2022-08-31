package StackDSA;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class UsingArrayList {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;

        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return  -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {

        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        while (!s1.isEmpty())
        {
            System.out.println(s1.peek());
            s1.pop();
        }

    }






}
