package me.jatinsingh.test2;

public class NodeMain {
	
	public static void main(String args[]) {
		
		MyLinkedList mll = new MyLinkedList();
		
		
		for(int i = 0 ; i <= 20 ; i ++) {
			mll.add(new Node("Node " + i));
		}
		
		mll.printLinkedList();
		
		Node node1 = new Node("Jatin");
		Node node2 = new Node("Singh");
		Node node3 = new Node("Gill");
		Node node4 = new Node("is");
		Node node5 = new Node("in");
		Node node6 = new Node("the");
		Node node7 = new Node("House");
		Node node8 = new Node("Baby!");
		
		
		node1.setNextNode(node2);
		node2.setNextNode(node3);
		node3.setNextNode(node4);
		node4.setNextNode(node5);
		node5.setNextNode(node6);
		node6.setNextNode(node7);
		node7.setNextNode(node8);
		
		Node nodePointer = node1;
		while(nodePointer != null) {
			System.out.println(nodePointer.getInfo());
			nodePointer = nodePointer.getNextNode();
			
		}
	}
}
