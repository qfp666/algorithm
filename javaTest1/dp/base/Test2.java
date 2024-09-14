package javaTest1.dp.base;

/**
 * 爬楼梯最少成本
 * 开始可以从 0 和 1 开始
 * 并且每次可以选择 爬两次楼梯 和一次楼梯
 *
 */
public class Test2
{
	public static void main(String[] args)
	{
		int a [] = new int[]{10,15,20};
		System.out.println(getCount(a));
	}

	public static int getCount(int a[]){
		//a记录的向上爬要花费的体力
        int b []  = new int[100];
		b[0]=b[1]=0;
		for(int i=2;i<=a.length;i++){
			b[i] =Math.min((b[i-1]+a[i-1]),b[i-2]+a[i-2]);
		}
        return b[a.length];
	}
}
