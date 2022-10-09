import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		BookStore bs=new BookStore("Uap BookStore");
		Scanner input=new Scanner(System.in).useDelimiter("\r\n");
		String tittle,author;
		int copies;
		while(true) {
			System.out.println("*********Menu*********");
			System.out.println("1.Display All the books.\n2.Order books.\n3.Sell books\n.4.Exit\n");
			System.out.println("Enter your option");
			int op=input.nextInt();
			
			switch(op) {
			case 1: //Display All the books.
				bs.displayAll();
				break;
			case 2: //Order books
				System.out.println("Please enter books tittle:");
				tittle=input.next();
				System.out.println("Please enter books author:");
				author=input.next();
				System.out.println("Please enter the copies of books:");
				copies=input.nextInt();
				bs.order(tittle,author,copies );
				break;
			case 3:
				System.out.println("Please enter books tittle:");
				tittle=input.next();
				System.out.println("Please enter books author:");
				author=input.next();
				System.out.println("Please enter the copies of books:");
				copies=input.nextInt();
				bs.sell(tittle,author,copies );
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option ");
				break;
			}
			
		}
	}

}
