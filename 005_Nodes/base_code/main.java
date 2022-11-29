import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		/*
			Create an ArrayList of 100 Nodes
			Store random integers in each of them
			Print out all of the values
		*/
		
		ArrayList<Node> List= new ArrayList<Node>();
		int L;
		for(int i = 0; i<100; i++){
			L = (int)(Math.random()*100);
			Node J = new Node(L);
			List.add(J);
		}
		
		for(int i = 0; i<100; i++){
			System.out.println(List.get(i).getData());
		}
	}
}
