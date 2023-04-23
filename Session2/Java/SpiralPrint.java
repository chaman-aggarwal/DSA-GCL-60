import java.util.Scanner;
class SpiralPrint{  

    public static void spiral(int matrix[][])
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int sr = 0;
        int sc = 0;
        int er = n-1;
        int ec = m-1;
        
        while(sr<=er && sc<=ec)
        {
            for(int i=sc; i<=ec; i++)
            {
                System.out.print(matrix[sr][i] + " ");
            }
            sr++;
            
            for(int i=sr; i<=er; i++)
            {
                System.out.print(matrix[i][ec] + " ");
            }
            ec--;
            
            if(sr<=er)
            {
                for(int i=ec; i>=sc; i--)
                {
                    System.out.print(matrix[er][i] + " ");
                }
            }
            er--;
            
            if(sc<=ec)
            {
                for(int i=er; i>=sr; i--)
                {
                    System.out.print(matrix[i][sc] + " ");
                }
            }
            sc++;
            
        }
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        spiral(arr);
    }  
}  