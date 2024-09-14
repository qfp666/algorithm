package javaTest1.dfs_bfs;

import java.util.Stack;

public class BfsTest
{

	public static void main(String[] args)
	{
		TreeNode tree = getTree();
		//testDfs(tree);
		testDfs2(tree);
	}
	public  static  TreeNode getTree(){
		TreeNode treeNode = new TreeNode(1);
		TreeNode current = treeNode;
		current.left=new TreeNode(2);
		current.right=new TreeNode(4);
		current = current.left;
		current.left=new TreeNode(5);
		current.right=new TreeNode(6);
		return treeNode;
	}

	/**
	 * 递归的方法实现
	 * @param root
	 */
	public  static void testDfs(TreeNode root){
		if(root==null){
			return;
		}
		System.out.println(root.val);
		testDfs(root.left);
		testDfs(root.right);
	}

	/**
	 * 采用栈的方式实现
	 * @param root
	 */
	public static void testDfs2(TreeNode root)
	{
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode pop = stack.pop();
			System.out.println(pop.val);
			if(pop.right!=null){
				stack.push(pop.right);
			}

			if(pop.left!=null){
				stack.push(pop.left);
			}
		}
	}
}
