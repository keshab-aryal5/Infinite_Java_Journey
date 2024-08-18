package com.keshab;

public class Main {
    public static void main(String[] args) {
//        String name = new String("Keshab");
//        System.out.println(name);
//        System.out.println(name.hashCode());
//        System.out.println("Hello "+name);
//        System.out.println(name.charAt(0));
//        System.out.println("Monster ".concat(name));
        StringBuffer sb = new StringBuffer("Keshab");
        sb.append(" Aryal");
        System.out.println(sb);


        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.insert(11,'S');
        System.out.println(sb);
//        String str = sb.toString();
        System.out.println(sb.length());
//        sb.setLength(10);
//        System.out.println(sb.length());
//        System.out.println(sb);


        sb.ensureCapacity(100);
    }
}
