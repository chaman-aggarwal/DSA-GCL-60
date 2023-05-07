import java.util.Scanner;
class BinarySearch{  

    public static int search(int arr[], int target)
    {
        int n = arr.length;
        int s=0;
        int e=n-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                s = mid+1;
            }
            else
            {
                e = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int result = search(arr, target);
        System.out.print(result);
    }  
}  