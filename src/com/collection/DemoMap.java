package com.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new HashMap<>();
		//add objects to collection
		m.put(91,"India");
		m.put(91, "Bharat");
		m.put(911, "USA");
		//List ot all the elements in map
		System.out.println(m);
		System.out.println(m.keySet());
		//retr the value for key 91
		System.out.println(m.get(91));
		
	}

}
