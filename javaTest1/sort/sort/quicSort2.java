package javaTest1.sort.sort;

public class quicSort2
{
	public static void main(String[] args)
	{

	}

	public static int getMind(int arr[],int left,int right){
		//找到中间那个数
		int mid = left+(right-left)/2;
		int max = (arr[left] > arr[mid] ? arr[left] : arr[mid]);
		max = max > arr[right] ? max : arr[right];
		int min = (arr[left] < arr[mid] ? arr[left] : arr[mid]);
		min = min < arr[right] ? min : arr[right];
		if (arr[left] != min && arr[left] != max) {
			return left;
		} else if (arr[mid] != min && arr[mid] != max) {
			return mid;
		} else {
			return right;
		}
	}

	public static void insertSort(int[]arr){
		for(int i=1;i<arr.length;i++){
			for(int j=i-1;j>=0;j--){
				if(arr[j+1]<arr[j]){
					swap(arr,j,j+1);
				}
			}
		}
	}

	public  static void quickSort(int a[],int start,int end){
		if(start>=end){
			return;
		}
		if(end-start+1<10){
			insertSort(a);
			return;
		}
		int mind = getMind(a, start, end);
		swap(a,start,mind);

		int pivot = partition(a,start,end);
		quickSort(a,start,pivot-1);
		quickSort(a,pivot+1,end);
	}

	public  static int partition(int[] a, int left, int right)
	{
		int pivot = a[left];
		int index =left;

		while(left<right){
			while(left<right&&a[right]>=pivot){
				right--;
			}
			while(right>left&&a[left]<=pivot){
				left++;
			}
			swap(a,left,right);
		}
		swap(a,index,left);
		return left;

	}




	public static void swap(int a[],int left,int right){
		 int temp = a[left];
		 a[left] = a[right];
		 a[right] = temp;
	}
}
