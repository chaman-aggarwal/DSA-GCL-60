import java.util.Scanner;
class MissingNumber{  

    public static int missing(int arr[])
    {
        int n = arr.length;
        int totalSum = n*(n+1)/2;
        int arraySum = 0;
        for(int i=0; i<n; i++) { 
            arraySum += arr[i];    
        }
        return totalSum - arraySum;
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = missing(arr);
        System.out.print(result);
    }  
}  