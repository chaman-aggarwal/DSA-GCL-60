int fib(int n)
{
    // base case
    if(n==0 || n==1)
    {
        return n;
    }

    return fib(n-1) + fib(n-2);

}
	
int fibTopDown(int n, int dp[])
{
    // base case
    if(n==0 || n==1)
    {
        return n;
    }
    // look up
    if(dp[n]!=0)
    {
        return dp[n];
    }

    int res;
    res = fibTopDown(n-1, dp) + fibTopDown(n-2, dp);
    dp[n] = res;

    return res;
}
	
int fibBottomUp(int n)
{
    int dp[] = new int[100]; 
    Arrays.fill(dp, 0);
    dp[1] = 1;
    for(int i=2; i<=n; i++)
    {
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
}
	
int fibOptimize(int n)
{
    if(n==0 || n==1)
    {
        return n;
    }
    int a = 0;
    int b = 1;
    int c;
    
    for(int i=2; i<=n; i++)
    {
        c = a+b;
        a = b;
        b = c;
    }
    return c;
}