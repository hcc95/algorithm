package com.cdut.test;

import com.cdut.datastructure.LinkList;

public class LinkListTest {
	public static void main(String[] args) {
		LinkList<String> linklist=new LinkList<String>();
		linklist.insert("123",0);
		linklist.add("456");
		System.out.println(linklist);
	}
}
