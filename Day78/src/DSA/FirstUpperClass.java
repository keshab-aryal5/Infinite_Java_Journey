package DSA;

public class FirstUpperClass {
    public static void main(String[] args) {
        String str = "geeksforGeeks";
        int pos = findUpperCase(str,0);
        if(pos == -1)
            System.out.println("No upperCaseCharacterFound");
        else
            System.out.println("Uppercase character at position "+pos);

    }
    static int findUpperCase(String str, int n)
    {
        if(n == str.length())
            return -1;
        else
        {
            if(Character.isUpperCase(str.charAt(n)))
                return n;
            else
                return findUpperCase(str,n+1);
        }
    }
}
