package com.Second.Question01;

public class Main {
    public static void main(String[] args) {
        InterfaceThree If3 = new ClassTwo();
        System.out.println(If3);

        If3.methodOne();
        If3.methodTwo();
        If3.methodThree();

        InterfaceOne If1 = new ClassTwo();
        If1.methodOne();
        ClassTwo C2 = (ClassTwo)If1;
        C2.methodTwo();
        C2.methodThree();
    }
}
