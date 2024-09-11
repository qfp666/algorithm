package javaTest1.back_tracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test2
{
	static LinkedList<Integer>   path = new LinkedList<Integer>();
	static List<List<Integer>> result   = new ArrayList();;
	public static void main(String[] args)
	{
		int[] distances = {58, 55, 57, 58, 60};
		int l = distances.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出最多旅行几个城市");
		int k = sc.nextInt();
		int MaxSum = 174;
		int maxDistance = getMaxDistance(distances, l, k, MaxSum);
		System.out.println("旅行最大距离为"+maxDistance);
	}

	private static int getMaxDistance(int[] distances, int l, int k, int maxSum)
	{
		int MaxSum=0;
		int sum=0;
		backTracking(distances,k,l,0);
		for(List<Integer> i :result){
			for(Integer a:i){
					 sum+=a;
			}
			if(sum<maxSum){
				MaxSum = Math.max(sum,MaxSum);
				sum=0;
			}
		}
		return MaxSum;
	}

	private static void backTracking(int[] distances, int k, int l, int startIndex)
	{
		if(path.size()==k){
			result.add(new ArrayList<Integer>(path));
			return;
		}
		for(int i=startIndex;i<l-(l-k)+1;i++){
			path.add(distances[i]);
			backTracking(distances,k,l,i+1);
			path.removeLast();
		}
	}
}
