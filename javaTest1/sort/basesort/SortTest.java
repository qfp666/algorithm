package javaTest1.sort.basesort;

import java.util.Arrays;

public class SortTest
{
	public static void main(String[] args)
	{
		int a[] = new int[]{5,4,3,2,1};
		maoPao(a);
		//select(a);
		insertSort(a);
		System.out.println(Arrays.toString(a));
	}

	/**
	 * 稳定排序  交换排序
	 * @param a
	 */
	public static void maoPao(int a[]){
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length-i;j++){
				if(a[j]<a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}

	/**
	 * 不稳定
	 * @param a
	 */
	public static void select(int a[]){
		for(int i =0;i<a.length;i++){
			int minIndex=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[minIndex]){//找到当前最小的
					minIndex = j; //记录当前最小的索引值
				}
			}
			//把当前最小的放到第一位
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}

	/**
	 * 稳定排序
	 */
	public static void insertSort(int a[]){
		for(int i=1;i<a.length;i++){
			for(int j=i-1;j>=0;j--){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

}
