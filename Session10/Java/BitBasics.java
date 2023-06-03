import java.util.Scanner;
class BitBasics{  

    public static boolean isOdd(int n)
    {
        return ((n&1)==1);
    }

    public static int getBit(int n, int i)
    {
        int mask = 1<<i;
        int bit = (n&mask) > 0 ? 1 : 0;
        return bit;
    }

    public static int setBit(int n, int i)
    {
        int mask = 1<<i;
        int bit = n|mask;
        return bit;
    }

    public static int clearBit(int n, int i)
    {
        int mask = ~(1<<i);
        int bit = n&mask;
        return bit;
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(isOdd(n));
        System.out.println(getBit(n,i));
        System.out.println(setBit(n,i));
        System.out.println(clearBit(n,i));
    }  
}  