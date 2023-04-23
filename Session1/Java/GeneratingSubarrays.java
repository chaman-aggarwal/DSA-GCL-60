import java.util.Scanner;
class GeneratingSubarrays{  

    public static void subarray(int arr[])
    {
        int n = arr.length;
        // starting point 
        for(int i=0; i<n; i++) {
            // ending point
            for(int j=i; j<n; j++) {
                // printing subarrays
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        subarray(arr); 
    }  
}  