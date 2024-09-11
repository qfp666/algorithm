package javaTest1.dp.linear_DP;

/**
 * 偷东西 相邻屋被偷 会触发报警装置
 */
public class Test1
{
	public static void main(String[] args)
	{
		System.out.println( getCount(new int[]{2,7,9,3,1}));

	}

	public static  int getCount(int a[]){
		int b [] = new int[100];
		b[0]=a[0];
		b[1]=Math.max(b[0],a[1]);
		for(int i=2;i<a.length;i++){
			   b[i] = Math.max(b[i-1],a[i]+b[i-2]);
		}
		return b[a.length-1];
	}
}
