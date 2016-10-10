package com.cdut.test;

import com.cdut.datastructure.SequenceStack;

public class SquenceStackTest {
	public static void main(String[] args) {
		SequenceStack<String> stack=new SequenceStack<String>();
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		stack.push("ddd");
		System.out.println(stack);
		System.out.println("栈顶:"+stack.peek());
		System.out.println("第一次弹出栈顶的元素:"+stack.pop());
		System.out.println("第二次弹出栈顶元素:"+stack.pop());
		System.out.println("两次pop之后的栈"+stack);
	}
}
