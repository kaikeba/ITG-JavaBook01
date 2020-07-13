package com.kkb.tz.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.kkb.tz.bean.Parent;
import com.kkb.tz.bean.Son;

class PolandTest {
	
	
	@Test
	public void testClass(){
	    Parent p = new Son();
	    System.out.println(p.getClass());
	    System.out.println(Parent.class);
	}
}
