package com.cdut.test2;

class Base 
{
	//定义了一个名为i的实例变量
	private int i = 2;
	public Base() 
	{
		this.display();
	}
	public void display() 
	{
		System.out.println(i);
	}
}
//继承Base的Derived子类
class Derived extends Base 
{
	//定义了一个名为i的实例变量
	private int i = 22;
	//构造器，将实例变量i初始化为222
	public Derived() 
	{
		i = 222;
	}
	public void display() 
	{
		System.out.println(i);
	}
}
public class Test 
{
	public static void main(String[] args) 
	{
		//创建Derived的构造器创建实例
		new Derived();
	}
}