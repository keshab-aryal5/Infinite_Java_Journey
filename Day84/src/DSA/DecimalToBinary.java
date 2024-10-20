package DSA;

public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 20;
        String ans = convertToBinary(number);
        System.out.println(ans);
        System.out.println(convertToDecimal(ans));
    }
    static String convertToBinary(int num)
    {
        int r = 0;
        String ans="";
        while(num>0)
        {
            r = num%2;
            ans += r;
            num /= 2;
        }
        StringBuilder sb = new StringBuilder(ans);
        return sb.reverse().toString();
    }
    static int convertToDecimal(String binary)
    {
        int ans = 0;
        int p2 = 1;
        for(int i=binary.length()-1;i>=0;i--)
        {
            if(binary.charAt(i) == '1')
                ans += p2;
            p2 *= 2;
        }
        return ans;
    }
}
