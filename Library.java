
public class Library {
	public String addBook(String booktitle) {
		System.out.println("Book added Successfully");
		System.out.println("Name of the book is" + booktitle);
		return booktitle;
	}
	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book Issued Successfully");
}
	
	public static void main(String[] args) {
		Library l=new Library();
		l.addBook("The First Minute");
		l.issueBook();
		
	}

}
