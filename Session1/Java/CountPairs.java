import java.util.Scanner;
class CountPairs{  

    public static int countPairsWithGivenSum(int arr[], int sum)
    {
        int n = arr.length;
        int count = 0;
        int i=0;
        int j=n-1;
        while(i<j) {
            if(arr[i]+arr[j]==sum) {
                count++;
                i++;
                j--;
            }
            else if(arr[i]+arr[j]<sum) {
                i++;
            }
            else {
                j--;
            }
        }
        return count==0 ? -1 : count;
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = countPairsWithGivenSum(arr, sum);
        System.out.print(result);
    }  
}  