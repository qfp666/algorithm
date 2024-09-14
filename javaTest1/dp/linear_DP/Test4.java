package javaTest1.dp.linear_DP;

public class Test4
{
	public static void main(String[] args)
	{
		System.out.println(getMax(7));
	}

	public static int getMax(int n){
		int[]dp = new int[n+1];
		dp[0] =0;
		dp[1]=1;
		for(int i=0;i<=n;i++){
			  if(2<=2*i&&2*i<=n){
				  dp[2*i]=dp[i];
			  }
			  if(2<=2*i+1&&2*i+1<=n){
				  dp[2*i+1]=dp[i+1]+dp[i];
			  }
		}
		int val = 0;
		for(int j=0;j<=n;j++){
			val = Math.max(val,dp[j]);
		}
		return val;
	}
}
