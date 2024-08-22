package com.keshab;

interface Keshab
{
    int value = 8;


    public static void giveInterfaceIntro()
    {
        System.out.println("Hello I am inside the interface");
    }
    default void Record4kVideo()
    {
        System.out.println("Hello I am a default method");
        System.out.println("Calling private method gree");
        greet();
    }
    private void greet()
    {
        System.out.println("Hello there I am a greet and private you cann't call me outside of this interface");
    }
}

class Aryal implements Keshab
{
    public void giveIntro()
    {
        System.out.println("Hello I am Aryal");
        System.out.println(this.value);
    }
//    public void Record4kVideo()
//    {
//        System.out.println("Recording from Aryal");
//    }


}
public class Main {
    public static void main(String[] args) {
        Keshab.giveInterfaceIntro();
        Aryal obj1 = new Aryal();
//        obj1.greet();
        obj1.giveIntro();
        obj1.Record4kVideo();
        obj1.giveIntro();
    }
}
