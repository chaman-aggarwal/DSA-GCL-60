import java.util.Scanner;
class CountSetBit{  

    public static int countSetBits(int n)
    {
        int ans = 0;
        while(n>0)
        {
            ans += (n&1);
            n = n>>1;
        }
        return ans;
    }

    // public static int countSetBitsOptimised(int n)
    // {
    //     int ans = 0;
    //     while(n>0)
    //     {
    //         n = n & (n-1);
    //         ans++;
    //     }
    //     return ans;
    // }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countSetBits(n));
        // System.out.print(countSetBitsOptimised(n));
    }  
}  