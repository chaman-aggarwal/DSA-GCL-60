import java.util.*;
class MergeSort{  

    public static void merge(int arr[], int s, int e)
    {
        int mid = (s+e)/2;
        int i = s;
        int j = mid+1;
        int k = s;
        int[] temp = new int[100];
        while(i<=mid && j<=e)
        {
            if(arr[i] < arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++] = arr[i++];
        }
        while(j<=e)
        {
            temp[k++] = arr[j++];
        }
        for(int itr=s; itr<=e; itr++)
        {
            arr[itr] = temp[itr];
        }
    }
 
    public static void mergeSort(int arr[], int s, int e)
    {
        if(s>=e)
        {
            return;
        }
        // 1. divide
        int mid = (s+e)/2;
        // 2. recursively sort
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        // 3. merge
        merge(arr, s, e);
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n-1); 
        for(int i=0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }  
}  