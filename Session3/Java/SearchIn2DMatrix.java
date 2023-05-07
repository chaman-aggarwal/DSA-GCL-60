import java.util.Scanner;
class SearchIn2DMatrix{  

    public static void search(int matrix[][], int target)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int s = 0;
        int e = n*m-1;
        boolean isPresent = false;
        while(s<=e)
        {
            int mid = (s+e)/2;
            int row = mid/m;
            int col = mid%m;
            
            if(matrix[row][col]==target)
            {
                isPresent = true;
                break;
            }
            else if(matrix[row][col] < target)
            {
                s = mid+1;
            }
            else
            {
                e = mid-1;
            }
        }
        if(isPresent==true)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        search(arr, target);
    }  
}  