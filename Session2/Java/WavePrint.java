import java.util.Scanner;
class WavePrint{  

    public static void waveArray(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        for(int col=0; col<m; col++){
            if(col%2==0){
                // even column Top down
                for(int row=0; row<n; row++){
                    System.out.print(arr[row][col] + " ");
                }
            }
            else{
                // odd column Bottom Up
                for(int row=n-1; row>=0; row--){
                    System.out.print(arr[row][col] + " ");
                }
            }
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
        waveArray(arr);
    }  
}  