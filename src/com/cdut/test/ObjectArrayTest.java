package com.cdut.test;

public class ObjectArrayTest {
	public static void main(String[] args) 
	{
		//定义、并初始化一个Object数组
		Object[] objArr = new Object[3];
		//让objArr所引用数组的第二个元素再次指向一个长度为2的Object[]数组
		objArr[1] = new Object[2];
		//将objArr[1]的值赋给objArr2，即让objArr2和objArr[1]指向同一个数组对象
		Object[] objArr2 = (Object[])objArr[1];
		//让objArr2所引用数组的第二个元素再次指向一个长度为3的Object[]数组
		objArr2[1] = new Object[3];
		//将objArr2[1]的值赋给objArr3，即让objArr3和objArr2[1]指向同一个数组对象
		Object[] objArr3 = (Object[])objArr2[1];
		//让objArr2所引用数组的第二个元素再次指向一个长度为3的int[]数组
		objArr3[1] = new int[5];
		////将objArr3[1]的值赋给iArr，即让iArr和objArr3[1]指向同一个数组对象
		int[] iArr = (int[])objArr3[1];
		//依次为iArr数组的每个元素赋值
		for (int i = 0 ; i < iArr.length ; i++ )
		{
			iArr[i] = i * 3 + 1;
		}
		//直接通过objArr访问iArr数组的第3个元素
		System.out.println( ((int[])((Object[])((Object[])objArr[1])[1])[1])[4] );
	}
}
