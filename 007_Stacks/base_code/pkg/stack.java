package pkg;
import java.util.Scanner;
import java.util.Random;


public class stack {
	/*  LAST IN FIRST OUT  */
	Node top;

	/* 
		Postcondition: The top will be null.
	*/
	public stack() {
		top = null;
	}

	/*
		Insert a new Node on top of the stack
	*/
	public void push(Character data){
		Node newNode = new Node(data);
		
		if(top == null){
			top = newNode;
			return;
		}
		
		Node curr = top; 

		while(curr.getNext() != null){
			curr = curr.getNext();
		}
		curr.setNext(newNode);
	}

	/*
		Removes the top node of the stack
	*/
	public Character pop(){
		
		Node curr = top; 
		Node prev = top;

		while(curr.getNext() != null){
			curr = curr.getNext();
		}
		while(prev.getNext() != curr){
			
		}
		
		prev.setNext(null);
		return curr.getData();
	}

	/*
		Returns the top value of the stack. Doesn't pop. 
	*/
	public Character peek(){
		
		if(top == null){
			return -1;
		}
		
		Node curr = top; 

		while(curr.getNext() != null){
			curr = curr.getNext();
		}
		return curr.getData();

	}

	/*
		Checks if the stack is empty. 
	*/
	public boolean isEmpty(){
		if(top == null){
			return true;
		}
		return false;
	}
}
