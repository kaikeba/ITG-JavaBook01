package com.kkb.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class TestTreeMap {

	@Test
	void testIterator() {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + ":" + map.get(key));
		}
	}

	@Test
	void testIterator1() {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		 Iterator<Map.Entry<String,Integer>> iterator1 = map.entrySet().iterator();
		   while(iterator1.hasNext()){
		       Map.Entry<String,Integer> entry = iterator1.next();
		       System.out.println(entry.getKey()+":"+entry.getValue());
		   }
	}

}
