package com.DSA;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "keshab";
        char target = 'b';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Search(name,target));
    }
    public static int Search(String name, char c)
    {
        if(name.length()==0)
            return -1;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==c)
                return i;
        }
        return -1;
    }
    public static boolean Search2(String name, char ch)
    {
        if(name.length()==0)
            return false;
        for(char c:name.toCharArray())
        {
            if(c==ch)
                return true;
        }
        return false;
    }
}
