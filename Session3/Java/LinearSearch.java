import java.util.Scanner;
class LinearSearch{  

    public static int search(int arr[], int key)
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int result = search(arr, key);
        System.out.print(result);
    }  
}  