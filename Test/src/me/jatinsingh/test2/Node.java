package me.jatinsingh.test2;

public class Node {
	
	Node nextNode;
	String info;
	
	Node(String info) {
		this.info = info;
		this.nextNode = null;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}