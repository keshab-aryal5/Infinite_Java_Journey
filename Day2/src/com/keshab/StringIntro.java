package com.keshab;

public class StringIntro {
    public static void main(String[] args) {
//        String name;
//        name = new String("Keshab");
//        System.out.println(name);
//        System.out.printf("The value of name is: %s",name);
        String name = "Keshab";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(3));
        System.out.println(name.replace('a','b'));
        System.out.println(name.startsWith("Ke"));
        System.out.println(name.endsWith("ab"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ab"));
        System.out.println(name.indexOf("ab",3));
        System.out.println(name.lastIndexOf("ab"));
        System.out.println(name.lastIndexOf("ab",5));
        System.out.println(name.equals("keshab"));
        System.out.println(name.equalsIgnoreCase("KESHAB"));
    }
}
