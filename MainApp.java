package library;

public class MainApp {
	public static void main(String[] args) {
		
		Manager manager1 = new Manager();
		manager1.id = 1111;
		manager1.name = "Anna";
		
		Manager manager2 = new Manager();
		manager2.id = 2222;
		manager2.name = "Bella";
		
		Manager [] managers = {manager1, manager2};
		
		Type type1 = new Type();
		type1.type = "Novel";
		
		Type type2 = new Type();
		type2.type = "Children";
		
		Type type3 = new Type();
		type3.type = "Fiction";
		
		Type[] types = {type1, type2, type3};
		
		Customer customer1 = new Customer();
		customer1.name = "A";
		customer1.id= 12345;
		customer1.address = "Avenue 1";
		customer1.phoneNo = "12345";
		
		Customer customer2 = new Customer();
		customer2.name = "B";
		customer2.id= 12333;
		customer2.address = "Avenue 2";
		customer2.phoneNo = "1232222";
		
		Customer [] customers = {customer1, customer2};
		
		Book book1 = new Book();
		book1.name = "A Modern Detective";
		book1.isbn = "111111";
		book1.author = "Edgar Allan Poe";
		book1.stock = 5;
		book1.location = "Floor1";
		book1.type = type1;
		book1.manager = manager1;
		book1.isReturned();
		System.out.println(book1.checkStatus());
		
		Book book2 = new Book();
		book2.name = "Looking for meaning of life";
		book2.isbn = "22222";
		book2.author = "James Holden";
		book2.stock = 10;
		book2.location = "Floor2";
		book2.type = type2;
		book2.manager = manager2;
		book2.isBorrowing();
		System.out.println(book2.checkStatus());
		
		Book[] books = {book1, book2};
		
		Loan loan1 = new Loan();
		loan1.receipt = "1a2b3d";
		loan1.date = new java.util.Date();
		loan1.customer = customer1;
		loan1.book = book1;
		
		Loan loan2 = new Loan();
		loan1.receipt = "jsvakbiu";
		loan1.date = new java.util.Date();
		loan1.customer = customer2;
		loan1.book = book2;
		
		Loan [] loans = {loan1, loan2};
		
	
		
		
//		System.out.println("Borrowing List: ");
//		for (Book book: books) {
//			
//			if (book.returned == false) {
//				
//				System.out.println(book.name);
//			}
//		}
		//show borrow and return status of a book
		
		System.out.println("-----");
		System.out.println("Status of books: ");
		for (Book book: books) {
			System.out.println(book.name + " "+ book.checkStatus());
		}
		
}
	
	
	
}
