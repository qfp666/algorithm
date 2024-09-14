package javaTest1.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

import static javaTest1.dfs_bfs.BfsTest.getTree;

public class dfsTest
{
	public static void main(String[] args)
	{
		TreeNode tree = getTree();
		testBfs(tree);
	}

	public static void testBfs(TreeNode root){
		Queue<TreeNode> queue = new LinkedList();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			System.out.println(node.val);
			if (node.left != null)
			{
				queue.add(node.left);
			}

			if (node.right != null){
					queue.add(node.right);
			}
		}
	}



}
