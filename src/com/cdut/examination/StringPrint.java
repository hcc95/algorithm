package com.cdut.examination;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringPrint {
	public static void main(String[] args) {
		String content = "中国aadf的111萨bbb菲的zz萨菲";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<content.length();i++)
		{
			char c = content.charAt(i);
			Integer num = (Integer) map.get(c);
			if(num == null)
				num = 1;
			else
				num = num + 1;
			map.put(c,num);
		} 
		Set<Entry<Character, Integer>> params = map.entrySet() ;
		for(Entry<Character, Integer> entry : params)
		{

			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
}
