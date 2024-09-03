package com.Assignment;
import java.util.Scanner;
class MaxTriesException extends Exception
{
    public String toString()
    {
        return "Maximum tries finished";
    }

}
public class Question3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        boolean status = true;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while(status)
        {
            int index = sc.nextInt();
            if(index>arr.length-1)
            {
                try
                {
                    count++;
                    if(count>5)
                    {
                        status = false;
                        throw new MaxTriesException();
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            else
                System.out.println(arr[index]);

        }
    }
}
