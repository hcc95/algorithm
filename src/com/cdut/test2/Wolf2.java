package com.cdut.test2;

class Animal2
{
	//desc实例变量保存对象toString方法的返回值
	private String desc;
	public Animal2()
	{
		//调用getDesc()方法初始化desc实例变量
		this.desc = getDesc();
	}
	public String getDesc()
	{
		return "Animal";
	}
	public String toString()
	{
		return desc;
	}
}
public class Wolf2 extends Animal2
{
	//定义name、weight两个实例变量
	private String name;
	private double weight;
	public Wolf2(String name , double weight)
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
		System.out.println(new Wolf2("灰太郎" , 32.3));
	}
}

