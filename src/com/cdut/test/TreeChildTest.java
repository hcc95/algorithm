package com.cdut.test;

import com.cdut.datastructure.TreeChild;

public class TreeChildTest {
	public static void main(String[] args) {
		TreeChild<String> tp=new TreeChild<String>("root");
		TreeChild.Node root=tp.root();
		System.out.println("根节点"+root);
	}
}
