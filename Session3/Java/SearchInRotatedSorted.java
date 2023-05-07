import java.util.Scanner;
class SearchInRotatedSorted{  

    public static int search(int arr[], int target)
    {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            // left half is sorted
            else if(arr[s]<=arr[mid])
            {
                if(arr[s] <= target && target <= arr[mid])
                {
                    e = mid-1;
                }
                else
                {
                    s = mid+1;
                }
            }
            // right half is sorted
            else
            {
                if(arr[mid] <= target && target <= arr[e])
                {
                    s = mid+1;
                }
                else
                {
                    e = mid-1;
                }
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
        System.out.print(search(arr, target));
    }  
}  