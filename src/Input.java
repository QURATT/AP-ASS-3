import java.io.BufferedReader;
import java.io.InputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
 

public class Input extends Thread{
	
	String f; 

	public Input(String f) {
		this.f= f;
	}
	
	Word[] wr= new Word[500];
	Vector<String> vec_tor = new Vector<String>();
	int i= 0;
	
	public void run() {	 
	    File file = new File(this.f);
	    Scanner input;
	    String word = null ;
	    int size= 0;
	   //System.out.println("BST: ");
	    
	    
		try {
			input = new Scanner(file);
			//main.bst.inorder();
			  while (input.hasNext()) {
			      word  = input.next();
			      vec_tor.add(word);
			      	  int status= 0;
			      	  
			    	  if(main.bst.search(word)==true)
			    	  {
			    		 // System.out.println("BST: "+main.bst.search(word));
			    		  for(int j=0; j<i; j++)
			    		  {
			    			  if(wr[j].getWord().compareTo(word) == 0)
			    			  {
			    				  wr[j].setFrequency(wr[j].getFrequency()+1);
			    				  status= 1;
			    			  }
			    		  }
			    		  if(status==0)
			    		  {
				    		  wr[i]= new Word(word, 1);
				    		  i+=1;
			    		  }
			    	  }
			      //System.out.println(word);
			    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("Size "+size);
	 
 
	}
	
	public void printVector()
	{
		System.out.println("Vector "+vec_tor);
	}
	
	public void printMatchWords()
	{
		for(int k=0; k<i; k++)
		{
			System.out.println("Word Array "+wr[k].getWord()+"Frequency "+wr[k].getFrequency());
		}
	}
}
