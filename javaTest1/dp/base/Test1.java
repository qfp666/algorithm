package javaTest1.dp.base;

/**
 * 给你一个非负整数       请你返回将他变成0需要的步数
 * 如果当前是偶数那么需要除以2  否则减去1
 */
public class Test1
{
	public static void main(String[] args)
	{
		System.out.println(getCount(14));
	}

	public static int getCount(int n){
		int a[] = new int[100];
		a[0] = 0;

		for(int i=1;i<=n;i++){
			if(i%2==1){
				a[i] = a[i-1]+1;
			}else{
				a[i] =a[i/2]+1;
			}
		}
		return a[n];
	}

}
