import java.util.Scanner;
class FirstAndLastPos{  

    public static void searchRange(int arr[], int target)
    {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int first = -1, last = -1;
            
        // first occurence
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==target)
            {
                first = mid;
                e = mid-1;
            }
            else if(arr[mid] > target)
            {            
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
        }
        
        s = 0;
        e = n-1;
        // last occurence
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==target)
            {
                last = mid;
                s = mid+1;
            }
            else if(arr[mid] > target)
            {            
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
        }
        System.out.print(first + " " + last);
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
        searchRange(arr, target); 
    }  
}  