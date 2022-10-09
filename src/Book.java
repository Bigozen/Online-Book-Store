
public class Book {
            String bookTittle;
            String  bookAuthor;
            int numOfCopies;
			
            
            public Book( String bookTittle,String  bookAuthor, int numOfCopies ) {
            	this.bookTittle=bookTittle;
            	this.bookAuthor=bookAuthor;
            	this.numOfCopies=numOfCopies;
            }

			
			public String toString() {
				return "Book [bookTittle=" + bookTittle + ", bookAuthor=" + bookAuthor + ", numOfCopies=" + numOfCopies
						+ "]";
			}
            
          
            	}
