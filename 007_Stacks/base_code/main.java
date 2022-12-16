import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;
import java.util.ArrayList.*;


class main {
	public static void main(String args[]) {
		
		
		ArrayList<Character> Equation = new ArrayList<Character>();
		ArrayList<Character> Answer = new ArrayList<Character>();
		
		String EQ = new String("(2+3)*7-(1+4)");
		for(int i = 0; i<EQ.length(); i++){
			Character c=EQ.charAt(i);
			Equation.add(c);
		}
		
		stack Operation = new stack();

		int Op;
		Character cur = new Character;

		while(Equation.getSize() != 0){
			cur = Equation.get(0);
			if(cur == '+' || cur == '-' || cur== '*' || cur== '/'){
				Operation.push(cur);
			}
			else if(cur == '('){
				while(!isEmpty){
					Answer.add(Operation.pop());
				}
				
				Equation.remove(0);
				cur = Equation.get(0);
					
					
				while(cur!= ')'){
					if(cur == '+' || cur == '-' || cur== '*' || cur== '/'){
						Operation.push(cur);
						Op++;
					}
					else{
						
					}
					cur = Equation.get(0);
				}
				
				
				
				
			}
			else{
				
			}
		}		
		
		
		
		
	}
}
