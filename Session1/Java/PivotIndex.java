import java.util.Scanner;
class PivotIndex{  

    public static int pivot(int arr[])
    {
        int n = arr.length;
        int totalSum = 0;
        for(int i=0; i<n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        int rightSum = totalSum;

        for(int i=0; i<n; i++) {
            rightSum -= arr[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = pivot(arr);
        System.out.print(result);
    }  
}  