package com.Question01;

public interface InterfaceThree extends InterfaceOne, InterfaceTwo {
    void methodThree();
}
abstract class ClassOne implements InterfaceThree{

    @Override
    public void methodThree() {
        System.out.println("Inside methodThree of com.Question01.ClassOne");
    }
}
class  ClassTwo extends ClassOne{

    @Override
    public void methodOne() {
        System.out.println("Inside methodOne of com.Question01.ClassTwo");
    }

    @Override
    public void methodTwo() {
        System.out.println("Inside methodTwo of com.Question01.ClassTwo");
    }
    @Override
    public String toString(){
        return "This is com.Question01.ClassTwo object";
    }
}