import java.util.*;
class Factorial{  

    public static int fact(int n)
    {
        // base case
        if(n==0)
        {
            return 1;
        }
        // recursive case
        int smallAns = n * fact(n-1);
        return smallAns;
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fact(n));
    }  
}  