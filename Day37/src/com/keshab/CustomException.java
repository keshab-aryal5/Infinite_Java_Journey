package com.keshab;

class NavinException extends Exception
{
//    @Override
//    public String toString()
//    {
//        return "Navin vai ko exception ho yo";
//    }
    public NavinException(String message)
    {
        super(message);
    }

}
public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try
        {
            j = 18/i;
            if(j==0)
                throw new NavinException("Khai k ho k  ho");
        }
        catch(NavinException e)
        {
            System.out.println(e);
        }
    }
}
