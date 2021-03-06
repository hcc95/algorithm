package com.cdut.collection;

import java.util.HashSet;

class Name2
{
    private String first;
	private String last;
    public Name2(String first, String last) 
	{
        this.first = first;
        this.last = last;
    }
	//根据first判断两个Name是否相等
    public boolean equals(Object o) 
	{
		if (this == o)
		{
			return true;
		}
		if (o.getClass() == Name2.class)
		{
			Name2 n = (Name2)o;
			return n.first.equals(first);
		}
		return false;
    }
	//根据first计算Name对象的hashCode()返回值
    public int hashCode()
	{
		return first.hashCode();
    }
	public String toString()
	{
		return "Name[first=" + first + ", last=" + last + "]";
	}
}
public class HashSetTest2
{
	public static void main(String[] args) 
	{
		HashSet<Name2> set = new HashSet<Name2>();
		set.add(new Name2("abc" , "123"));
		set.add(new Name2("abc" , "456"));
		System.out.println(set);

	}
}
