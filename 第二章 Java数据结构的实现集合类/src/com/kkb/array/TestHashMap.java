package com.kkb.array;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

class TestHashMap {
	
	HashMap<String,Object> map = new HashMap<>();
	
	{
		map.put("A","1");
		map.put("B","2");
		map.put("C","3");

	}
	
	@Test
	void testFor() {
		//分别获取key和value的集合
		 for(String key : map.keySet()){
		     System.out.println(key);
		 }
		 System.out.println("====");
		 for(Object value : map.values()){
		     System.out.println(value);
		 }
	}
	
	@Test
	void testForGet() {
		 //2、获取key集合，然后遍历key，根据key得到 value
		 Set<String> keySet = map.keySet();
		 for(String str : keySet){
		     System.out.println(str+"-"+map.get(str));
		 }
	}
	
	
	@Test
	void testForEntry() {
		 //3、得到 Entry 集合，然后遍历 Entry
		 Set<Map.Entry<String,Object>> entrySet = map.entrySet();
		 for(Map.Entry<String,Object> entry : entrySet){
		     System.out.println(entry.getKey()+"-"+entry.getValue());
		 }
	}
	
	@Test
	void testForIterator(){
		 Iterator<Map.Entry<String,Object>> iterator = map.entrySet().iterator();
		 while(iterator.hasNext()){
		    Map.Entry<String,Object> mapEntry = iterator.next();
		    System.out.println(mapEntry.getKey()+"-"+mapEntry.getValue());
	    }
	}
	
	

}
