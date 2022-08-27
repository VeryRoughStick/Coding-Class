import pkg.*;
import java.util.*;
import java.io.*;       

class main {        // This should be all that is in your main.java file.
	public static void main(String args[]) throws FileNotFoundException {
        BBoard myBoard = new BBoard("Poole's Amazing BBoard");          // Feel free to change the name.
     myBoard.loadUsers(args[0]);
        // myBoard.loadUsers("users.txt");
        myBoard.run();
        
            //User tests
        // User Aram = new User("Stickboy","Fallen");
        // System.out.println(Aram.check("Stickboy","nelly"));
        // System.out.println(Aram.check("Stickboy","Fallen"));
        // System.out.println(Aram);
        
        }
        
    }
