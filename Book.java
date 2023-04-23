package library;

public class Book {
	String name;
	String isbn;
	String author;
	static int stock ;
	String location;
	Type type;
	Manager manager;
	static boolean returned = false;
	
	
	public static String checkStatus() {
		if (returned==true) {
			return "is returned";
		}
		else 
			return "is borrowing";
		
	}
	
	
	public void isReturned() {
		returned = true;
	}
	public void isBorrowing() {
		returned = false;
	}
	
	public static int checkStock() {
		int currentStock = stock;
		if (returned==false) 
			currentStock -=1;
			
		else
			currentStock +=1;
		
		return currentStock;
	}
	
}

