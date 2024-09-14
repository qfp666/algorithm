package javaTest1.back_tracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1
{
	static List<List<Integer>> result = new ArrayList<>();
	static LinkedList<Integer> path = new LinkedList<>();
	public static void main(String[] args)
	{
		List<List<Integer>> combine = combine(4, 2);
		System.out.println(combine.toString());
	}

	public static  List<List<Integer>> combine(int n,int k){
		              backtracking(n,k,1);
					  return result;
	}

	private static void backtracking(int n, int k, int startIndex)
	{
          if(path.size()==2){
			  result.add(new ArrayList<Integer>(path));
			  return;
		  }
		  for(int i=startIndex;i<=n-(k-path.size())+1;i++){
			  path.add(i);
			  backtracking(n,k,i+1);
			  path.removeLast();
			  path.pop();
		  }
	}
}
