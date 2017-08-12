package com.hand.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Number {
public static void main(String[] args) {
	List<Integer> ls=new ArrayList<Integer>();
	Map<Integer, Integer> jcMap = new HashMap<Integer, Integer>();
	for(int i=1;i<=50;i++){
		int num=(int) (Math.random()*100) + 1;
		if(num < 100){
		ls.add(num);
		
	}
	Iterator<Integer> it=ls.iterator();
	while(it.hasNext()){
		int m=it.next();
		int s=m/10;
		jcMap.put(s,m);
	}
	
	
	
	Set<Integer> set = jcMap.keySet();
	for (Integer key : set) {
		Set<Integer> temp=jcMap.keySet();
		System.out.println(temp);
	}
	}
	System.out.println(ls);
	System.out.println(jcMap);
}
}
