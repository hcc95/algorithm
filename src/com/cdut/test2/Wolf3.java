package com.cdut.test2;

class Animal3
{
	public String getDesc()
	{
		return "Animal";
	}
	public String toString()
	{
		return getDesc();
	}
}
public class Wolf3 extends Animal3
{
	//定义name、weight两个实例变量
	private String name;
	private double weight;
	public Wolf3(String name , double weight)
	{
		//为name、weight两个实例变量赋值
		this.name = name;
		this.weight = weight;
	}
	//重写父类的getDesc()方法
	@Override
	public String getDesc()
	{
		return "Wolf[name=" + name + " , weight="
			+ weight + "]";
	}
	public static void main(String[] args)
	{
		System.out.println(new Wolf3("灰太郎" , 32.3));
	}
}
