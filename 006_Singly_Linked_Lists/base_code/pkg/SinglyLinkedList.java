package pkg;
import java.util.Scanner;
import java.util.Random;


public class SinglyLinkedList {
	Node head;

	/* 
		Postcondition: The head will be null 
	*/
	public SinglyLinkedList() {
		head = null;
	
	}

	/* 
		Receives an integer position, searches through the SinglyLinkedList 
		for the position and returns the data at that positon
	   	If the position doesn't exist, it returns -1
	*/ 
	public int get(int pos){
		
		Node D = head;
		int i = 0;
		while(i < pos){
			D = D.getNext();
			i++;
		}
		
		if(D == null){	
			return -1;
		}
		else{
			return D.getData();
		}
	}

	/*
		Insert a new Node at the given position with the data given
	*/
	public void insert(int pos, int data){

		Node Z = new Node(data);
		Node D = head;
		
		if(pos == 0){
			if(head == null){
				head = Z;	
			}else{
				Z.setNext(head);
				head = Z;	
			}
			
		}
		else{
			int i = 0;
			while(i < pos-1){
				D = D.getNext();
				i++;
			}
			Z.setNext(D.getNext());
			D.setNext(Z);	
		}
	}

	/*
		Remove the node at the given position
		If no position exists, don't change the list
	*/
	public void remove(int pos){
		Node D = head;
		for(int i = 0; i<pos-2; i++){
			D = D.getNext();
		}
		D.setNext(null);
	}

	/*
		Swap two Nodes with the two positions given
	*/
	public void swap(int pos1, int pos2){
		int D = get(pos1);
		int Z = get(pos2);
		
		insert(pos1,Z);
		remove(pos1+1);
		
		insert(pos2, D);
		remove(pos2+1);
	}

	/*
		Print all data values in the LinkedList 
	*/
	public void printList(){
		Node D = head;
		while(true){
			System.out.println(D.getData());
			D = D.getNext();
			if(D == null){
				break;
			}
		}
	}
}
