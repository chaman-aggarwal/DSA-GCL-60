import java.util.Scanner;
class RotateImage{  

    public static void rotate(int matrix[][])
    {
        int n = matrix.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // reverse
        for(int i=0; i<n; i++)
        {
            int s=0;
            int e=n-1;
            while(s<e)
            {
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
                s++;
                e--;
            }
        }
        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr);
    }  
}  