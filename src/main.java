import java.util.Scanner;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	static BST_class bst= new BST_class();
	
	public static void main(String[] args) {
		
		int n=args.length;
		
		Vocabulary v= new Vocabulary(args[0]);
		v.start();
		//System.out.println("Enter files");
		Scanner cin = new Scanner(System.in);
		//opt= cin.nextInt();
		for(int k=0; k<n; k++) {
			System.out.println(args[k]);
		}
	
		
		//for(int k=1; k<n; k++) {  
			int choice = 0;
			boolean valid= false;
			cin = new Scanner(System.in);
			 
			do 
			{
				System.out.println("Enter any choice from MENU");
			System.out.println("1. Displaying BST build from Vocabulary File");
			System.out.println("2. Displaying Vectors build from Input files");
			System.out.println("3. Viewing Match words and its frequency");
			System.out.println("4. Searching a query->It should display all the files query found in");
			System.out.println("5. Enter 5 for Exiting");
			choice = cin.nextInt();
	
				// TODO Auto-generated method stub
				switch(choice)
				{
					case 1:
						//Vocabulary v= new Vocabulary(args[0]);
						//v.start();
						try {
							v.join();
							v.display();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					break;
					case 2:
						//Vocabulary v= new Vocabulary(args[0]);
						//v.start();
						try {
							v.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Input[] i= new Input[n-1];
						for(int m=0 ;m<n-1; m++)
						{
							i[m]= new Input(args[m+1]);
							i[m].start();
							try {
								i[m].join();
								i[m].printVector();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					break;
					case 3:
						//v.start();
						try {
							v.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Input[] ii= new Input[n-1];
						for(int m=0 ;m<n-1; m++)
						{
							ii[m]= new Input(args[m+1]);
							ii[m].start();
							try {
								ii[m].join();
								ii[m].printMatchWords();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					break;
					case 5:
						System.out.println("EXITING");
						valid= true;
						return;
					//break;
					default:
						System.out.println("INVALID CHOICE");
				}
		}while(!valid);
		}
//	}

}
