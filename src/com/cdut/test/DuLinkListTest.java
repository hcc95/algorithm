package com.cdut.test;

import com.cdut.datastructure.DuLinkList;

public class DuLinkListTest {
	public static void main(String[] args) {
		DuLinkList<String> list=new DuLinkList<String>();
		list.insert("aa", 0);
		list.add("aaa");
		System.out.println(list);
	}
}
