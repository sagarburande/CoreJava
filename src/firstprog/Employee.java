package firstprog;

public class Employee {
	private int EmpID;
	private String EmpName;
	private double EmpSalary;
	
	public void employee(int x, String name, double y)
	{
		EmpID=x;
		EmpName=name;
		EmpSalary=y;
	}
	public void display()
	{
		System.out.println("ID:"+EmpID+"\n"+"Name:"+EmpName+"\n"+"$:"+EmpSalary);
	}
	public Employee()
	{
		EmpID=2;
		EmpName="Nikhil";
		EmpSalary=1800;
	}
	public Employee(int x,String name,double y)
	{
		EmpID=x;
		EmpName=name;
		EmpSalary=y;
	}

	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.employee(1, "Dinu", 800);
		obj.display();
		System.out.println("=====================");
		Employee obj1=new Employee();
		System.out.println("EMP.ID:"+obj1.getEmpID());
		System.out.println("Name:"+obj1.getEmpName());
		System.out.println("$:"+obj1.getEmpSalary());
		System.out.println("=====================");
		obj.setEmpID(3);
		obj.setEmpName("Sagar");
		obj.setEmpSalary(1000);
		obj.display();
	}

}
