package firstprog;

public class Book {
	private int BookID;
	private String BookName;
	private double Price;
	
	
	public void book(int x, String str, double d)
	{
		BookID=x;
		BookName=str;
		Price=d;
	}
	
	public Book()
	{
		BookID=01;
		BookName="Science";
		Price=225.50f;
	}
	
	
	public int getBookID() {
		return BookID;
	}


	public void setBookID(int bookID) {
		BookID = bookID;
	}


	public String getBookName() {
		return BookName;
	}


	public void setBookName(String bookName) {
		BookName = bookName;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(float price) {
		Price = price;
	}


	public Book(int x, String y, float z) {
		BookID=x;
		BookName=y;
		Price=z;
	}
	public void display() {
		System.out.println("BookID="+BookID+"\n"+"Name="+BookName+"\n"+"Price="+Price);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj=new Book();
		System.out.println("ID="+obj.BookID);
		System.out.println("Name="+obj.BookName);
		System.out.println("MRP="+obj.Price);
		obj.setBookID(02);
		obj.setBookName("History");
		obj.setPrice(250.50f);
		obj.display();
		Book obj1=new Book();
		obj1.book(3, "Maths", 300.00);
		obj1.display();
		obj1.book(4, "Physics", 450.00);
		obj1.display();

	}

}
