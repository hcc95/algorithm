package com.cdut.datastructure;

public class ArrayBinTree<T> {
	private Object[] datas;
	private int DEFAULT_DEEP=8;
	private int deep;
	private int arraySize;
	public ArrayBinTree() {		
		this.deep = DEFAULT_DEEP;
		this.arraySize = (int)Math.pow(2, deep)-1;
		datas=new Object[arraySize];
	}
	public ArrayBinTree(int deep){
		this.deep = deep;
		this.arraySize = (int)Math.pow(2, deep)-1;
		datas=new Object[arraySize];
	}
	public ArrayBinTree(int deep,T data){
		this.deep = deep;
		this.arraySize = (int)Math.pow(2, deep)-1;
		datas=new Object[arraySize];
		datas[0]=data;
	}
	public void add(int index,T data,boolean left){
		if(datas[index]==null){
			throw new RuntimeException(index+"处节点为空，不能添加新的节点");
		}
		if(2*index+1>=arraySize){
			throw new RuntimeException("树底层的数组已满，无法添加");
		}
		if(left){
			datas[2*index+1]=data;
		}else{
			datas[2*index+2]=data;
		}
	}
	public boolean empty(){
		return datas[0]==null;
	}
	public T root(){
		return (T) datas[0];
	}
	public T parent(int index){
		return (T) datas[(index-1)/2];	
	}
	public T left(int index){
		if(2*index+1>=arraySize){
			throw new RuntimeException("改节点为叶子节点，无子节点");
		}
		return (T) datas[index*2+1];	
	}
	public T right(int index){
		if(2*index+1>=arraySize){
			throw new RuntimeException("改节点为叶子节点，无子节点");
		}
		return (T) datas[index*2+2];	
	}
	public int deep(int index){
		return deep;	
	}
	public int pos(T data) {
		for(int i=0;i<arraySize;i++){
			if(datas[i].equals(data)){
				return i;
			}
		}
		return -1;
	}
	public String toString(){
		return java.util.Arrays.toString(datas);
	}
}
