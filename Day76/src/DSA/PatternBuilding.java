package DSA;

public class PatternBuilding {
    public static void main(String[] args) {
        printPattern1();
        printPattern2();
        printPattern3();
        printPattern4();
        printPattern5(5);
        printPattern28(5);
        printPattern30(5);
        printPattern17(5);
        printPattern31(5 );
        printPattern32(5);
    }
    public static void printPattern32(int n)
    {
        int i,j,up,down,left,right,min;
        for(i=0;i<=2*n;i++)
        {
            for(j=0;j<=2*n;j++)
            {
                left = j;
                right = 2*n-j;
                up = i;
                down = 2*n-i;
                min = Math.min(Math.min(left,right),Math.min(up,down));
                System.out.print(min+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printPattern31(int n)
    {
        int i,j,up,down,left,right,min;
        for(i=1;i<2*n;i++)
        {
            for(j=1;j<2*n;j++)
            {
                up = i-1;
                down = 2*n-1-i;
                left = j-1;
                right = 2*n-1-j;
                min = Math.min(Math.min(up,down),Math.min(left,right));
                System.out.print(n-min+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printPattern17(int n)
    {
        int i,j,space,start;
        for(i=1;i<2*n;i++)
        {
            if(i<=n)
            {
                space = n-i;
                start = i;
            }
            else
            {
                space = i%n;
                start = 2*n-i;
            }
            for(j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            for(j=start;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(j=2;j<=start;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printPattern30(int n)
    {
        int i,j,space;
        for(i=1;i<=n;i++)
        {
            for(j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printPattern28(int n)
    {
        int i,j,space,k,star;
        for(i=1;i<2*n;i++)
        {

            if(i<=n)
            {
                space = n-i;
                star = i;
            }
            else
            {
                space = i%n;
                star = 2*n-i;
            }
            for(j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=star;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printPattern5(int n)
    {
        int c;
        for(int i=1;i<2*n;i++)
        {
            if(i<=n)
                c=i;
            else
                c= 2*n-i;
            for(int j=0;j<c;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printPattern4()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printPattern3()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printPattern1()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
    }
    public static void printPattern2()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
