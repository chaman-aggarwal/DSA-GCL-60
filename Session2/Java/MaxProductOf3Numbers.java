import java.util.Scanner;
class MaxProductOf3Numbers{  

    public static int maximumProduct(int nums[])
    {
        int n = nums.length;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++)
        {
            if(nums[i] <= min1)
            {
                min2 = min1;
                min1 = nums[i];
            }
            else if(nums[i] < min2)
            {
                min2 = nums[i];
            }
            
            if(nums[i] >= max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] >= max2)
            {
                max3 = max2;
                max2 = nums[i];
            }
            else if(nums[i] > max3)
            {
                max3 = nums[i];
            }
        }
        int op1 = max1 * max2 * max3;
        int op2 = min1 * min2 * max1;
        return Math.max(op1, op2);
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int result = maximumProduct(arr);
        System.out.println(result);
    }  
}  