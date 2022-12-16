package pkg;
import java.util.Scanner;
import java.util.Random;


public class Node {
	Node next;
	Character data;

	public Node(Character data) {
		next = null;
		this.data = data;
	}
	public void setNext(Node next){
		this.next = next;
	}
	public Character getData(){
		return data;
	}	
	public Node getNext(){
		return next;
	}
}
