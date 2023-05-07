import java.util.*;
class BubbleSort{  

    public static void sorting(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        sorting(arr); 
        for(int i=0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }  
}  