package com.cdut.test2;

class Base3 
{
	//定义了一个名为i的实例变量
	private int i = 2;
	public Base3() 
	{
		//直接输出this.i
		System.out.println(this.i);
		this.display();
		//输出this实际的类型，将看到输出Derived
		System.out.println(this.getClass());
		//因为this的编译类型是Base，所以依然不能调用sub()方法，
		//this.sub();
	}
	public void display() 
	{
		System.out.println(i);
	}
}
//继承Base的Derived子类
class Derived3 extends Base3
{
	//定义了一个名为i的实例变量
	private int i = 22;
	//构造器，将实例变量i初始化为222
	public Derived3() 
	{
		i = 222;
	}
	public void display() 
	{
		System.out.println(i);
	}
	public void sub(){}
}
public class Test3 
{
	public static void main(String[] args) 
	{
		//创建Derived的构造器创建实例
		new Derived3();
	}
}
