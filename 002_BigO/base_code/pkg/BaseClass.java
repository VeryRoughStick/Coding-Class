package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public BaseClass(int[] A) {
	
		// Randomize(A);
		// Search(A);
		
		// int[] B = A;
		// int[] C = A;
		// int[] D = A;
		
		// Bubble(B);
		// Insertion(C);
		// Selection(D);
		
	}
	
	public void Randomize(int[] A){
		int z;
		for(int i = 0; i<A.length; i++){
			z = (int)Math.random()*200000;
			A[i] = z;
		}
	}

	public Boolean Search(int[] A){
		
		int z;
		
		z=(int)Math.random()*200000;
		
		for(int i = 0; i<A.length; i++){
			if(z == A[i]){
				return true;
			}
		}
		return false;
	}
	
	public void Bubble(int[] A){
		
	}
	
	public void Insertion(int[] A){
        
	}
		
	public void Selection(int[] A){
		
	}
		
}
