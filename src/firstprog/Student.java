package firstprog;

public class Student {
	private int RollNo;
	private String StdName;
	private double Percentage;

	public void student(int x, String str, double d) {
		RollNo = x;
		StdName = str;
		Percentage = d;
	}

	public Student() {
		RollNo = 02;
		StdName = "Sourabh";
		Percentage = 65.60d;
	}

	public Student(int roll, String name, float per) {
		RollNo = roll;
		StdName = name;
		Percentage = per;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getStdName() {
		return StdName;
	}

	public void setStdName(String stdName) {
		StdName = stdName;
	}

	public double getPercentage() {
		return Percentage;
	}

	public void setPercentage(double d) {
		Percentage = d;
	}

	public void display() {
		System.out.println("Roll.No=" + RollNo + "\n" + "Name=" + StdName + "\n" + "Per=" + Percentage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student();
		obj1.student(01, "sudhir", 50.50);
		obj1.display();
		Student obj = new Student();
		System.out.println("================================");
		System.out.println("RollNo:" + obj.getRollNo());
		System.out.println("Name:" + obj.getStdName());
		System.out.println("%:" + obj.getPercentage());
		System.out.println("================================");
		obj.setRollNo(3);
		obj.setStdName("Dinesh");
		obj.setPercentage(66.66);
		obj.display();

	}

}
