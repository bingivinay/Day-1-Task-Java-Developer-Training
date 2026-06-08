package Task;

public class Student{
	private String  StudentId;
	private String StudentName;
	private String Cource;
	private String Percentage;
	
	public Student(String studentId, String studentName, String cource, String percentage) {
		super();
		this.StudentId = studentId;
		this.StudentName = studentName;
		this.Cource = cource;
		this.Percentage = percentage;
	}
	
	public String getStudentId() {
		return StudentId;
	}
	
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getCource() {
		return Cource;
	}
	public void setCource(String cource) {
		Cource = cource;
	}
	public String getPercentage() {
		return Percentage;
	}
	public void setPercentage(String percentage) {
		Percentage = percentage;
	}
	public void displayStudentDetails() {
        System.out.println("Student ID: " + StudentId);
        System.out.println("Student Name: " + StudentName);
        System.out.println("Course: " + Cource);
        System.out.println("Percentage: " + Percentage);
        System.out.println("----------------------------");
    }
	
	public static void main(String[] args) {
		
		Student s1=new Student("A001","Vinay","CSE","85.0");
		Student s2=new Student("A002","Tharun","EEE","80.55");
		Student s3=new Student("A003","venu","civil","67.14");
		
		s1.displayStudentDetails();
		s2.displayStudentDetails();
		s3.displayStudentDetails();
	}
}

