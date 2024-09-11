package javaTest1.dp.linear_DP;

/**
 * 小偷问题2  偷了第一个最后一个不能偷
 */
public class Test2
{
	public static void main(String[] args)
	{
		System.out.println( getCount(new int[]{2,7,9,3,1}));
	    test("12");
	}

	public static int getCount(int a[]){
		int n  = a.length;
		int dp[][] = new int[100][2];
		if(n==1){
			return a[0];
		}else if(n==2){
			return Math.max(a[0],a[1]);
		}
		dp[0][0]=0;
		dp[0][1]=a[0];
		for(int i=1;i<n;i++){
			for(int j=0;j<2;j++){
				if(i==1){
					if(j==0){
						dp[i][j]=a[1];
					}else{
						dp[i][j]=a[0];
					}
				}else if(i==n-1&&j==1){
					//比较特殊第一个偷了
					dp[i][j] = dp[i-1][j];
				}else{
					dp[i][j]=Math.max(dp[i-1][j],dp[i-2][j]+a[i]);
				}
			}
		}
		return Math.max(dp[n-1][0],dp[n-1][1]);
	}

	public static void test(String s){
		char[] charArray = s.toCharArray();
		int a = (charArray[0]- '0')*10;
		int b = charArray[1]- '0';
		System.out.println(a+"...."+b);
	}
}
