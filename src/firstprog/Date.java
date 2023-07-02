package firstprog;

public class Date {
	private int day, month, year;

	// first method is created

	public void Data(int x, int y, int z) {
		day = x;
		month = y;
		year = z;
	}

	// second method is created

	public void display() {
		System.out.println("Date:" + day + "/" + month + "/" + year);
	}

	public Date() {
		day = 28;
		month = 06;
		year = 2023;
	}

	public Date(int x, int y, int z) {
		day = x;
		month = y;
		year = z;
	}
	

	public int getDay() {
		return day;
	}

	public void setDay(int x) {
		day = x;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int y) {
		month = y;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int z) {
		year = z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date obj = new Date();
		obj.Data(28, 06, 2023);
		obj.display();
		Date obj2=new Date();
		System.out.println("Day="+obj2.getDay());
		System.out.println("Month="+obj2.getMonth());
		System.out.println("Year="+obj2.getYear());
		obj2.setDay(28);
		//obj2.display();
		obj2.setMonth(06);
		//obj2.display();
		obj2.setYear(2023);
		obj2.display();
		
	}

}
