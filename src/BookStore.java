
public class BookStore {
		String name;
         Book[] books=new Book[10];
       
		public BookStore(String name) {
			this.name = name;
		}
	 private Book  findBook (String bookTittle,String bookAuthor ) {
			for(int i=0; i<books.length; i++) {
				if(books[i]==null) {
					return null;
					}
				if (books[i].bookTittle.equals(bookTittle) && books[i].bookAuthor.equals(bookAuthor)) {
					return books[i];
				}
				
			}
		
			return null;	
		}
       public void sell(String bookTittle,String author,int noOfCopies ) {
    	   Book b=findBook ( bookTittle,author );
    	   if(b!=null) {
    		   if(b.numOfCopies>=noOfCopies ) {
    			   b.numOfCopies-=noOfCopies;
    		   }
    		   else
    		  System.out.println("Not enough copies");
    	   }
    	   else
    		   System.out.println("Sorry this book is not available");
    	   
       }
       public void order(String bookTittle,String author,int noOfCopies ) {
    	   Book b=findBook ( bookTittle,author );
    	   if(b!=null) {
    		   b.numOfCopies+=noOfCopies;
    	   }
    	   else {
    		   for(int i=0;i<books.length;i++) {
    			  if(books[i]==null) {
    				  books[i]=new Book(bookTittle,author,noOfCopies );
    				  break;
    			  }
    		   }
    		   }
    	   
       }
       public void displayAll() {
    	   for(int i=0;i<books.length;i++) {
    		   if(books[i]!=null)
    		   System.out.println(books[i]);
    	   }
       }
}
