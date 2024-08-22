package com.keshab;
enum Status
{
    Running, Failed, Pending, Success;
}
public class Enumeration {
    public static void main(String[] args) {
        int i = 5;
//        Status s = Status.Running;
//        System.out.println(s);

//        Status[] ss = Status.values();
//        for(Status s: ss)
//            System.out.println(s);
        Status s = Status.Running;
//        if(s==Status.Running)
//            System.out.println("All Good");
        switch (s) {
            case Running -> System.out.println("All good");
            case Failed -> System.out.println("Try again");
            case Pending -> System.out.println("Please wait");
            default -> System.out.println("Done");
        }
    }
}
