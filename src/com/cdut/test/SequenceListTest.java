package com.cdut.test;

import com.cdut.datastructure.SequenceList;

public class SequenceListTest {
	public static void main(String[] args) {
		SequenceList<String> list=new SequenceList<String>();
		list.add("123");
		list.add("456");
		list.insert("11", 1);
		list.delete(0);
		System.out.println(list);
		System.out.println("456location："+list.location("456"));
	}
}
