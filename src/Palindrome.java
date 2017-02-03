import java.io.*;
import java.util.*;

public class Palindrome extends LectureFichier {
    
    private LinkedList<String> plaindrome;
	
	public Palindrome(String a)
	{
		super(a);
	}
	
	public void afficher()
	{		
		for(int i = super.getContenu().size() - 1; i >= 0; i--) {
			System.out.println(this.getContenu().get(i));
		}
	}
        
        public LinkedList<String> getPalindrome() {
		return plaindrome;
	}
        
        public void afficherPalyndrome()
	{		
		for(int i = 0; i < this.getPalindrome().size(); i++) {
			System.out.print(this.getPalindrome().get(i));
		}
	}

}