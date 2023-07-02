package firstprog;

public class Employee1 {
	static private int EmpID;
	private String EmpName;
	private double EmpSalary;
	static private String Company;
	
	static {
		System.out.println("I am Static Block");
		EmpID=1000;
		Company="Infosys";
	}
	public Employee1() {
		++Employee1.EmpID;
		this.EmpName="undefined";
		this.EmpSalary=0.0d;
	}
	public Employee1(String name,double sal)
	{
		++Employee1.EmpID;
		this.EmpName=name;
		this.EmpSalary=sal;
	}
	public int SetempID()
	{
		return EmpID;
	}
	public void display()
	{
		System.out.println("ID:"+EmpID);
		System.out.println("Name:"+EmpName);
		System.out.println("Salary:"+EmpSalary);
		System.out.println("Company:");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp=new Employee1("seed",9000);
		emp.display();
		Employee1 emp1=new Employee1("om",50000);
		emp1.display();
		System.out.println("ID:"+Employee1.EmpID);
		System.out.println("Name:"+Employee1.Company);
		System.out.println();
	}

}
