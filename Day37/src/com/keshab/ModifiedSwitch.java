package com.keshab;

public class ModifiedSwitch {
    public static void main(String[] args) {
        int a = 10;
        switch(a)
        {
            case 5 -> System.out.println("Hey its 5");
            case 50 -> System.out.println("Hey its 50");
            default -> System.out.println("Hey its default case");
        }
    }
}
