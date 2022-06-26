package com.Xpath;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetitive_Program {
	
	public static void main(String[] args) {
		
	String s="By the people For the people of the people";
	String[] split=s.split(" ");
	Map<String,Integer>m=new HashMap<>();
	 for (String string : split) {
		
		 if (m.containsKey(string)) {
			
			 Integer i=m.get(string);
			 m.put(string, i+1);
		}
		 else {
			m.put(string, 1);
		} 
	} 
		
	 System.out.println(m); 

		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);
			}
		}
		
		
		
		
	}
	
	
	
	

}
