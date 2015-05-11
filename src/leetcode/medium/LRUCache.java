package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LRUCache {

	List list;
	HashMap map;
	int capacity;
	
	public LRUCache(int capacity) {

		this.capacity = capacity;
		this.list = new LinkedList();
		this.map = new HashMap();
	}

	public static void main(String args[]){
		LRUCache lru = new LRUCache(2);
		lru.set(2,1);
		System.out.println(lru.get(2));
		lru.set(3,2);
		System.out.println(lru.get(2));
		System.out.println(lru.get(3));		
	}
	
	public int get(int key) {

		if(this.map.containsKey(key)){
			
			return (int) map.get(key);
		}
		else return -1;
	}

	public void set(int key, int value) {
		if(!this.map.containsKey(key)){
			if(map.size()!=this.capacity){
				
				this.list.add(0, key);
				this.map.put(key, value);
			}else{
//			int index= (int) this.list.get(capacity-1);
			this.map.remove(this.list.get(capacity-1));
			this.list.remove(capacity-1);
			this.list.add(0,key);
			this.map.put(key, value);
		}
	  }else{
			this.list.remove(this.list.indexOf(key));
			this.list.add(0,key);
		}
	}
	
}
