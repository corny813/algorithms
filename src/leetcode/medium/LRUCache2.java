package leetcode.medium;

import java.util.HashMap;

public class LRUCache2 {

	private int capacity;
	DoubleLinkNode head;
	DoubleLinkNode end;
	HashMap<Integer, DoubleLinkNode> map;

	public LRUCache2(int capacity) {
		this.map = new HashMap<Integer, DoubleLinkNode>();
		this.capacity = capacity;
	}

	public static void main(String args[]) {
		LRUCache2 lru = new LRUCache2(1);
		lru.set(2, 1);
		System.out.println(lru.get(2));
		lru.set(3, 2);
		System.out.println(lru.get(2));
		System.out.println(lru.get(3));
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			DoubleLinkNode node = map.get(key);
			removeNode(node);
			setHead(node);
			return node.val;
		} else {
			return -1;
		}
	}

	public void set(int key, int value) {
		if (!map.containsKey(key)) {
			DoubleLinkNode node = new DoubleLinkNode(key, value);
			if (map.size() != this.capacity) {
				setHead(node);
				map.put(key, node);
			} else {
				DoubleLinkNode oldNode = end;
				map.remove(end.key);
				end = end.pre;
				removeNode(oldNode);
				setHead(node);
				map.put(key, node);
			}
		} else {
			DoubleLinkNode node = map.get(key);
			node.val = value;
			removeNode(node);
			setHead(node);
		}
	}

	private void setHead(DoubleLinkNode newNode) {

		newNode.pre = null;

		if (head != null) {
			newNode.next = head;
			head.pre = newNode;
		}
		head = newNode;
		if (end == null) {
			end = newNode;
		}
	}

	private void removeNode(DoubleLinkNode oldNode) {

		if (oldNode.pre != null) {
			oldNode.pre.next = oldNode.next;
		} else {
			head = oldNode.next;
		}
		if (oldNode.next != null) {
			oldNode.next.pre = oldNode.pre;
		} else {
			end = oldNode.pre;
		}
	}

}

class DoubleLinkNode {
	int val;
	int key;
	DoubleLinkNode pre;
	DoubleLinkNode next;

	DoubleLinkNode(int v, int k) {
		this.val = v;
		this.key = k;
	}
}
