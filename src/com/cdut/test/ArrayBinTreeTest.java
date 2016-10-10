package com.cdut.test;

import com.cdut.datastructure.ArrayBinTree;

public class ArrayBinTreeTest {
	public static void main(String[] args) {
		ArrayBinTree<String> binTree=new ArrayBinTree<String>(4,"根");
		binTree.add(0, "第二层右节点", false);
		binTree.add(2, "第三层右节点", false);
		binTree.add(6, "第四层右节点", false);
		System.out.println(binTree);
	}
}
