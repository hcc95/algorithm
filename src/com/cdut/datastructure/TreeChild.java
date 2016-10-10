package com.cdut.datastructure;

import java.util.ArrayList;
import java.util.List;

public class TreeChild<E> {
	private static class SonNode{
		private int pos;
		private SonNode next;
		public SonNode(int pos, SonNode next) {
			this.pos = pos;
			this.next = next;
		}		
	}
	public static class Node<T>{
		T data;
		SonNode frist;
		public Node(T data) {
			this.data = data;
			this.frist = null;
		}
		public String toString() {
			if(frist!=null){
				return "TreeChild$Node [data=" + data + ", frist=" + frist.pos + "]";
			}else{
				return "TreeChild$Node [data=" + data + ", frist=-1]";
			}			
		}		
	}
	private final int DEFAULT_TREE_SIZE=100;
	private int treeSize=0;
	private Node<E>[] nodes;
	private int nodeNums;
	public TreeChild (E data){
		treeSize=DEFAULT_TREE_SIZE;
		nodes=new Node[treeSize];
		nodes[0]=new Node<E>(data);
		nodeNums++;		
	}
	public TreeChild(E data,int treeSize){
		this.treeSize=treeSize;
		nodes=new Node[treeSize];
		nodes[0]=new Node<E>(data);
		nodeNums++;
	}
	public void addNode(E data,Node parent){
		for(int i=0;i<treeSize;i++){
			if(nodes[i]==null){
				nodes[i]=new Node(data);
				if(parent.frist==null){
					parent.frist=new SonNode(i,null);
				}else{
					SonNode next=parent.frist;
					while(next.next!=null){
						next=next.next;
					}
					next.next=new SonNode(i,null);
				}
				nodeNums++;
				return ;
			}
		}
		throw new RuntimeException("树已满");
	}
	public boolean empty(){
		return nodes[0]==null;
	}
	public Node<E> root(){
		return nodes[0];
	}
	public List<Node<E>> child(Node parent){
		List<Node<E>> list=new ArrayList<Node<E>>();
		SonNode next=parent.frist;
		while(next!=null){
			list.add(nodes[next.pos]);
			next=next.next;
		}
		return list;
	}
	public Node<E> child(Node parent,int index){
		SonNode next=parent.frist;
		for(int i=0;next!=null;i++){
			if(index==i){
				return nodes[next.pos];
			}
			next=next.next;
		}		
		return null;	
	}
	public int deep(){
		return deep(root());
	}
	private int deep(Node node){
		if(node.frist==null){
			return 1;
		}else {
			int max=0;
			SonNode next=node.frist;
			while(next!=null){
				int temp=deep(nodes[next.pos]);
				if(temp>max){
					max=temp;
				}
			}
			return max+1;
		}	
		
	}
	public int pos(Node node) {
		for(int i=0;i<treeSize;i++){
			if(nodes[i]==node){
				return i;
			}
		}
		return -1;
	}
}
