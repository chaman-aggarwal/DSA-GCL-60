import java.util.*;
class Power{  

    public static int power(int a, int b)
    {
        // base case
        if(b==0){
            return 1;
        }
        return a*power(a, b-1);
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(power(a, b));
    }  
}  