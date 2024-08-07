package com.keshab;
import java.util.Arrays;
public class SearchInStrings {
    public static void main(String[] args) {
        String name = "keshab";
        char target = 'b';
        System.out.println(Search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean Search(String str,char ch)
    {
        if(str.length()==0)
            return false;
        else
        {
            for(char c: str.toCharArray())
            {
                if(c==ch)
                    return true;
            }
            return false;
        }
    }
}
