package com.cdut.collection;

import java.util.HashSet;

class Name
{
    private String first;
	private String last;
    public Name(String first, String last) 
	{
        this.first = first;
        this.last = last;
    }
    
    public boolean equals(Object o) 
	{
		if (this == o)
		{
			return true;
		}
		if (o.getClass() == Name.class)
		{
			Name n = (Name)o;
			return n.first.equals(first)
				&& n.last.equals(last);
		}
		return false;
    }
}
public class HashSetTest
{
	public static void main(String[] args) 
	{
		HashSet<Name> s = new HashSet<Name>();
		s.add(new Name("abc", "123"));
		System.out.println(
			s.contains(new Name("abc", "123")));
		System.out.println(s.equals(new Name("abc", "123")));
	} 
}
