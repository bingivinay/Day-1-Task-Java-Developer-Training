package Task;

public class Employee {
	private String EmployeeID;
	private String EmployeeName;
	private String Designation;
	private String Salary;
	public String getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public Employee(String employeeID, String employeeName, String designation, String salary) {
		super();
		this.EmployeeID = employeeID;
		this.EmployeeName = employeeName;
		this.Designation = designation;
		this.Salary = salary;
	}
	
	public void displayEmployee() {
		System.out.println("Employee ID : "+EmployeeID);
		System.out.println("employee NAme : "+EmployeeName);
		System.out.println("Employee designation : "+Designation);
		System.out.println("Salary: "+Salary);
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("101","Viany","Software Engineer","50000");
		Employee e2=new Employee("102","ram","java devloper","650000");
		Employee e3=new Employee("103","vishnu","AWS architet","100000");
		
		e1.displayEmployee();
		e2.displayEmployee();
		e3.displayEmployee();
	}
	
	
	

}
