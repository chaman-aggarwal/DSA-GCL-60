import java.util.Scanner;
class TrappingRainWater{  

    public static int trap(int arr[])
    {
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--)
        {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        
        int water = 0;
        for(int i=1; i<n-1; i++)
        {
            water += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        return water;
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(trap(arr));
    }  
}  