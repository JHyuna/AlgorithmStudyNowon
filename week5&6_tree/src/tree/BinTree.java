package tree;

import java.util.Comparator;

public class BinTree<K,V> {
	
	static class Node<K,V>{
		private K key;
		private V data;
		private Node<K,V> left;
		private Node<K,V> right;
		
		Node(K key, V data, Node<K,V> left, Node<K,V> right){
			this.key = key;
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		K getKey() {
			return key;
		}
		
		V getValue() {
			return data;
		}
		
		void print() {
			System.out.println(data);
		}
		
	}
	
	private Node<K,V> root;
	private Comparator<? super K> comparator = null;
	
	public BinTree() {
		root = null;
	}
	
	public BinTree(Comparator<? super K> c) {
		this();
		comparator = c;
	}
	
	private int comp(K key1, K key2) {
		return (comparator == null) ?((Comparable<K>)key1).compareTo(key2)
				: comparator.compare(key1,key2);
	}
	
	public V search(K key) {
		Node<K,V> p = root;
		
		while(true) {
			if(p == null)
				return null;
			int cond = comp(key,p.getKey());
			if(cond == 0)
				return p.getValue();
			else if(cond < 0) {
				p = p.left;
			}else {
				p = p.right;
			}
	
		}
	}
	
	//node를 루트로 하는 서브트리에 노드<K,V>를 삽입
	private void addNode(Node<K,V> node, K key, V data) {
		//key>node.getkey() 이면 양수, <이면 음수, =이면 동일
		int cond = comp(key, node.getKey());
		if(cond == 0) {
			return;
		}
		else if(cond < 0) {
			if(node.left == null)
				node.left = new Node<K,V>(key,data,null,null);
			else
				addNode(node.left,key,data);
		}else {
			if(node.right == null)
				node.right = new Node<K,V>(key,data,null,null);
			else
				addNode(node.right,key,data);
		}
	}
	
	public void add(K key,V data) {
		if(root == null) {
			root = new Node<K,V>(key,data,null,null);
		}else {
			addNode(root,key,data);
		}
	}
	
	public boolean remove(K key) {
		Node<K,V> p = root;
		Node<K,V> parent = null;
		boolean isLeftChild = true;       //왼쪽 자식인가?
		
		while(true) {
			if(p == null)
				return false;
			int cond = comp(key,p.getKey());
			if(cond == 0)
				break;
			else {
				parent = p;
				if(cond < 0) {
					isLeftChild = true;
					p = p.left;
				}else {
					isLeftChild = false;
					p = p.right;
				}
			}
		}
		
		//p에 왼쪽 자식이 없음 - p는 삭제할 노드
		if(p.left == null) {
			if(p == root) {
				root = p.right;
			//삭제할 노드는 parent의 왼쪽 자식인가?
			}else if(isLeftChild) {
				parent.left = p.right;
			}else {
				parent.right = p.right;
			}
		}else if(p.right == null) {
			if(p == root)
				root = p.left;
			else if(isLeftChild) {
				parent.left = p.left;
			}else {
				parent.right = p.left;
			}
		//둘 다 있는 경우
		}else {
			parent = p;
			Node<K,V> left = p.left;
			isLeftChild = true;
			// 가장 큰 노드 left 검색
			while(left.right != null) {
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			//지우려고 하는 노드의 자리에 left.key와 left.data를 넣어줌
			p.key = left.key;
			p.data = left.data;
			if(isLeftChild)
				parent.left = left.left;
			else
				parent.right = left.left;
		}
		return true;
	}
	
}
