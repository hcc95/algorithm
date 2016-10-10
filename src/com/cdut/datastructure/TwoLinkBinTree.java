package com.cdut.datastructure;

public class TwoLinkBinTree<E> {
	public static class TreeNode {
		private Object data;
		private TreeNode left;
		private TreeNode right;
		public TreeNode() {
			
		}
		public TreeNode(Object data) {
			this.data=data;
		}
		public TreeNode(Object data, TreeNode left, TreeNode right) {
			super();
			this.data = data;
			this.left = left;
			this.right = right;
		}				
	}
	private TreeNode root;
	public TwoLinkBinTree() {
		this.root = new TreeNode();
	}
	public TwoLinkBinTree(E data) {
		this.root = new TreeNode(data);
	}
	public TreeNode addNode(TreeNode parent,E data,boolean isLeft){
		if(parent==null){
			throw new RuntimeException(parent+"节点为空，无法添加子节点");
		}
		if(isLeft && parent.left!=null){
			throw new RuntimeException("节点已经有左节点，无法添加左节点");
		}
		if(!isLeft && parent.right!=null){
			throw new RuntimeException("节点已经有右节点，无法添加右节点");
		}
		TreeNode newNode=new TreeNode(data);
		if(isLeft){
			parent.left=newNode;
		}else {
			parent.right=newNode;
		}
		return newNode;
	}
	public boolean empty(){
		return root.data==null;
	}
	public TreeNode root(){
		if(empty()){
			throw new RuntimeException("树为空，无法访问根节点");
		}
		return root;
	}
	public E parent(TreeNode node){
		return null;
	}
	public E leftChild(TreeNode parent){
		if(parent == null){
			throw new RuntimeException("节点为空，无法添加子节点");
		}
		return parent.left==null?null:(E)parent.left.data;
	}
	public E rightChild(TreeNode parent){
		if(parent == null){
			throw new RuntimeException("节点为空，无法添加子节点");
		}
		return parent.right==null?null:(E)parent.right.data;
	}
	public int deep(){
		return deep(root);
	}
	private int deep(TreeNode node) {
		if(node==null){
			return 0;
		}
		if(node.left==null&&node.right==null){
			return 1;
		}else{
			int leftDeep=deep(node.left);
			int rightDeep=deep(node.right);
			int max=leftDeep>rightDeep?leftDeep:rightDeep;
			return max+1;
		}
	}
}
