import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		
		SinglyLinkedList List = new SinglyLinkedList();
		
		for(int i = 0; i<5; i++){
			int C = (int)(Math.random()*50);
			List.insert(i,C);
		}
		
		int Z = 1;
		for(int i = 0; i<5; i++){
			System.out.println(List.get(i));
		}
	}
}
