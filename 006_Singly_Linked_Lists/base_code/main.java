import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		
		SinglyLinkedList List = new SinglyLinkedList();
		
		for(int i = 0; i<20; i++){
			int C = (int)(Math.random()*50);
			List.insert(0,C);
			System.out.println(C + "spawn PB");
		}
		
		for(int i = 0; i<20; i++){
			int C = (int)(Math.random()*19);
			List.insert(C,-1);
			// List.printList();
			System.out.println(C + "spawn -1");
		}
		System.out.println("--------List 1----------");
		List.printList();
		
		int z = 39;
		for(int i = 0; i<20; i++){
			// System.out.println("i" + i);
			// System.out.println("z" + z);
			List.swap(i,z);
			z--;
		}
		
		System.out.println("--------List 2----------");
		List.printList();
	}
}
