package javaTest1.sort.sort;

import java.util.Arrays;

/**
 * 快速排序    属于交换排序
 */
public class quickSort
{
	public static void main(String[] args)
	{
      int a[]= new int[]{5,4,3,2,1};
	  quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	public  static void quickSort(int a[],int start,int end){
	    if(start>=end){
			return;
		}
		int pivot = partition(a,start,end);
		quickSort(a,start,pivot-1);
		quickSort(a,pivot+1,end);
	}

	public  static int partition(int[] a, int left, int right)
	{
		 int pivot = a[left];
		 int index =left;
		 while(left<right){
			 while(left<right && a[right]>=pivot){
				 right--;
			 }
			 while(left<right && a[left]<=pivot){
				 left++;
			 }
			 swap(a,left,right);
		 }
		 swap(a,index,left);
		 return left;
	}

	public static void swap(int[] arr, int left, int right)
	{
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}


}
