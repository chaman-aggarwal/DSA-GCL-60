import java.util.*;
class IncDecSequence{  

    public static void inc(int n)
    {
        // base case
        if(n==0)
        {
            return;
        }
        inc(n-1);
        System.out.print(n + ", ");
    }

    public static void dec(int n)
    {
        // base case
        if(n==0)
        {
            return;
        }
        System.out.print(n + ", ");
        dec(n-1);
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inc(n);
        // dec(n);
    }  
}  