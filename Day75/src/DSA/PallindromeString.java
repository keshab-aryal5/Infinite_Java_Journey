package DSA;

public class PallindromeString {
    public static void main(String[] args) {
        boolean isPallindrome = true;
        String name = "abcdcba";
        int i, j;
        for (i = 0, j = name.length() - 1; i < j; i++, j--) {
            if (name.valueOf(name.charAt(i)).equals(name.valueOf(name.charAt(j))))
                continue;
            else {
                isPallindrome = false;
                break;
            }
        }
        if (isPallindrome)
            System.out.println("Yea");
        else
            System.out.println("Nah");
    }
}
