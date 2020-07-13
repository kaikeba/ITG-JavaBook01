package com.kkb.array;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

class TestLinkedHashMap {
	
//	 LinkedHashMap<String,String> map = new LinkedHashMap<>();
	 
	 LinkedHashMap<String,String> map = new LinkedHashMap<>(16,0.75F,true);
	 {
		 map.put("A","1");
		 map.put("B","2");
	     map.put("C","3");
		 map.get("B");
	 }
	 

	@Test
	void testEntry() {
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		for(Map.Entry<String,String> entry : entrySet ){
		      System.out.println(entry.getKey()+"---"+entry.getValue());
	       }
	}
	
	@Test
	void testIterator() {
		Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
	          Map.Entry<String,String> entry = iterator.next();
		        System.out.println(entry.getKey()+"----"+entry.getValue());
	     }
	}
	
	

}
