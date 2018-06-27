package com.test.jdk;

public class Test1 {

    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a + b;

        System.out.println(addition.operation(1,2));

    }

    interface MathOperation {
        int operation(int a, int b);

    }


}
