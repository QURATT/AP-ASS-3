
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vocabulary extends Thread {

	String f;
	public Vocabulary(String f) {
		// TODO Auto-generated constructor stub
		this.f=f;
	}

	public void run() {
		// TODO Auto-generated method RUN
		File ofile= new File(this.f);;
		Scanner input = null;
		try {
			input = new Scanner(ofile);
			while(input.hasNextLine())
			{
				main.bst.insert(input.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
	
	public void display()
	{
		System.out.println("BST");
		main.bst.inorder();
	}

}
