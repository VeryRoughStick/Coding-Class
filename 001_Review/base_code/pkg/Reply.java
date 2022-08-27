package pkg;
import java.util.*;
import java.io.*;

public class Reply extends Message {
	private String author;
	private String subject;
	private String body;
	private int id;

	// Default Constructor
	public Reply() {

	}

	// Parameterized Constructor
	public Reply(String auth, String subj, String bod, int i) {
		super(auth,subj,bod,i);
	}

	// Returns if this is a reply (true)
	public boolean isReply(){
		return true;
	}
}
