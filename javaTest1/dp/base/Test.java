package javaTest1.dp.base;

/**
 * 青蛙一次只能跳一个台阶或两个台阶,n个台阶能跳多少次
 */
public class Test
{
	public static void main(String[] args)
	{
		System.out.println(getCount(7));

	}

	/**
	 * 递归
	 * @param n
	 * @return
	 */
	/*public static int  getCount(int n){
		if(n<=2){
			return n;
		}

		return getCount(n-2)+getCount(n-1);
	}*/

	/**
	 * 已经知道f(0)=1;
	 * 动态规划(递归->迭代) 空间换时间
	 * @param n
	 * @return
	 */
	public static int  getCount(int n){
		int a[] = new int[100];
		a[0] = 1;
		a[1] = 1;
		 for(int i=2;i<=n;i++){
			 a[i] =a[i-1]+a[i-2];
		 }
		 return a[n];
	}
}
