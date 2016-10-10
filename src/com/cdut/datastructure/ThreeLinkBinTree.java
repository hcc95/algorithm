package com.cdut.datastructure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ThreeLinkBinTree<E> {
	public static class TreeNode{
		Object data;
		TreeNode left;
		TreeNode right;
		TreeNode parent;
		public TreeNode(){
		}
		public TreeNode(Object data){
			this.data = data;
		}
		public TreeNode(Object data , TreeNode left
			, TreeNode right , TreeNode parent){
			this.data = data;
			this.left = left;
			this.right = right;
			this.parent = parent;
		}
	}
	private TreeNode root;
	public ThreeLinkBinTree(){
		this.root = new TreeNode();
	}
	public ThreeLinkBinTree(E data){
		this.root = new TreeNode(data);
	}
	public TreeNode addNode(TreeNode parent , E data
			, boolean isLeft){
		if (parent == null){
			throw new RuntimeException(parent +
				"节点为null，无法添加子节点");
		}
		if (isLeft && parent.left != null){
			throw new RuntimeException(parent +
				"节点已有左子节点，无法添加左子节点");
		}
		if (!isLeft && parent.right != null){
			throw new RuntimeException(parent +
				"节点已有右子节点，无法添加右子节点");
		}
		TreeNode newNode = new TreeNode(data);
		if (isLeft){
			//让父节点的left引用指向新节点
			parent.left = newNode;
		}
		else{
			//让父节点的left引用指向新节点
			parent.right = newNode;
		}
		//让新节点的parent引用到parent节点
		newNode.parent = parent;
		return newNode;
	}
	public boolean empty(){
		//根据根元素来判断二叉树是否为空
		return root.data == null;
	}
	public TreeNode root(){
		if (empty()){
			throw new RuntimeException("树为空，无法访问根节点");
		}
		return root;
	}
	public E parent(TreeNode node){
		if (node == null){
			throw new RuntimeException(node +
				"节点为null，无法访问其父节点");
		}
		return (E)node.parent.data;
	}
	public E leftChild(TreeNode parent){
		if (parent == null){
			throw new RuntimeException(parent +
				"节点为null，无法添加子节点");
		}
		return parent.left == null ? null : (E)parent.left.data;
	}
	public E rightChild(TreeNode parent){
		if (parent == null){
			throw new RuntimeException(parent +
				"节点为null，无法添加子节点");
		}
		return parent.right == null ? null : (E)parent.right.data;
	}
	public int deep(){
		//获取该树的深度
		return deep(root); 
	}
	private int deep(TreeNode node){
		if (node == null){
			return 0;
		}
		//没有子树
		if (node.left == null&& node.right == null){
			return 1;
		}else{
			int leftDeep = deep(node.left);
			int rightDeep = deep(node.right);
			//记录其所有左、右子树中较大的深度
			int max = leftDeep > rightDeep ? 
				leftDeep : rightDeep;
			//返回其左右子树中较大的深度 + 1
			return max + 1;
		}
	}
	//实现先序遍历
	public List<TreeNode> preIterator(){
		return preIterator(root);
	}
	private List<TreeNode> preIterator(TreeNode node){
		List<TreeNode> list = new ArrayList<TreeNode>();
		//处理根节点
		list.add(node);
		//递归处理左子树
		if (node.left != null){
			list.addAll(preIterator(node.left));
		}
		//递归处理右子树
		if (node.right != null){
			list.addAll(preIterator(node.right));
		}
		return list;
	}
	
	
	//实现中序遍历
	public List<TreeNode> inIterator(){
		return inIterator(root);
	}
	private List<TreeNode> inIterator(TreeNode node){
		List<TreeNode> list = new ArrayList<TreeNode>();
		//递归处理左子树
		if (node.left != null){
			list.addAll(inIterator(node.left));
		}
		//处理根节点
		list.add(node);
		//递归处理右子树
		if (node.right != null){
			list.addAll(inIterator(node.right));
		}
		return list;
	}
	
	
	//实现后序遍历
	public List<TreeNode> postIterator(){
		return postIterator(root);
	}
	
	private List<TreeNode> postIterator(TreeNode node){
		List<TreeNode> list = new ArrayList<TreeNode>();
		//递归处理左子树
		if (node.left != null){
			list.addAll(postIterator(node.left));
		}
		//递归处理右子树
		if (node.right != null){
			list.addAll(postIterator(node.right));
		}
		//处理根节点
		list.add(node);
		return list;
	}
	//广度优先遍历
	public List<TreeNode> breadthFirst(){
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		List<TreeNode> list = new ArrayList<TreeNode>();
		if( root != null){
			//将根元素加入“队列”
			queue.offer(root);
		}
		while(!queue.isEmpty()){
			//将该队列的“队尾”的元素添加到List中
			list.add(queue.peek());
			TreeNode p = queue.poll();
			//如果左子节点不为null，将它加入“队列”
			if(p.left != null){
				queue.offer(p.left);
			}
			//如果右子节点不为null，将它加入“队列”
			if(p.right != null){
				queue.offer(p.right);
			}
		}
		return list;
	}
}
