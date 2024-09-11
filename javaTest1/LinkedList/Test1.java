package javaTest1.LinkedList;

import javaTest1.LinkedList.singleList.ListNode;

public class Test1
{
	public static void main(String[] args)
	{
		ListNode pre = inintListNode();
		ListNode head = inintListNode2();
		ListNode listNode1 = delListNode(pre, 3);//删除节点测试(无虚拟结点)
		//ListNode listNode2 = delListNodeByHead(head, 2);//删除结点测试有虚拟结点
		printListNode(listNode1);
	}

	/**
	 * 无头结点的链表(虚拟结点)
	 * @return
	 */
	public static ListNode  inintListNode(){
		ListNode pre= new ListNode(1);
	    ListNode cur=pre;
		cur.next=new ListNode(2);
		cur=cur.next;
		cur.next=new ListNode(3);
		return pre;
	}

	/**
	 * 无头结点的链表(虚拟结点)
	 * @return
	 */
	public static ListNode inintListNode2()
	{
		ListNode head = new ListNode();
		head.next = new ListNode(1);
		ListNode cur = head.next;
		cur.next = new ListNode(2);
		cur = cur.next;
		cur.next = new ListNode(3);
		cur = cur.next;
		return  head;
	}

	/**
	 * 删除结点没有虚拟结点头节点的办法
	 */
	public static ListNode delListNode(ListNode head,int val){
		if(head==null||head.next==null){
			return null;
		}
		ListNode cur = head;
		while(cur.next!=null&&cur!=null){
			   if(val==head.val){
				   head = head.next;   //删除头结点有点特殊
			   }else if(val==cur.next.val){
				    cur.next = cur.next.next;
			   }else{
				   cur = cur.next;
			   }
		}
		return head;
	}
	/**
	 * 删除结点有虚拟结点头结点的办法
	 */
	public static ListNode delListNodeByHead(ListNode head,int val){
		if(head==null||head.next==null){
			return null;
		}
		ListNode cur = head;
		while(cur.next!=null&&cur!=null){
			if(val==cur.next.val){
				cur.next = cur.next.next;
			}else{
				cur = cur.next;
			}
		}
		return head.next;
	}

	/**
	 * 打印结点
	 */
	public  static void printListNode(ListNode head){
		if(head==null){
			return;
		}
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
}
