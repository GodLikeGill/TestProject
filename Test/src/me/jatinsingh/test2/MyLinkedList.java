package me.jatinsingh.test2;

public class MyLinkedList {
	
	Node headNode;
	
	public void add(Node node) {
		if(headNode == null) {
			headNode = node;
			return;
		}
		else {
			Node nodePointer = headNode;
			while(nodePointer.getNextNode() != null) {
				nodePointer = nodePointer.getNextNode();
			}
			nodePointer.setNextNode(node);
			return;
		}
	}
	
	public void printLinkedList() {
		
		Node nodePointer = headNode;
		while(nodePointer != null) {
			System.out.println(nodePointer.getInfo());
			nodePointer = nodePointer.getNextNode();
		}
	}
}