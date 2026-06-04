package Task_1;

public class JavaSetupCheck {

	public static void main(String[] args) {
		
		String Version_Name= System.getProperty("java.version");
		String Os_Name=System.getProperty("os.name");
		String User_Name=System.getProperty("user.name");
		
		System.out.println("java version is :"+Version_Name);
		System.out.println("Operating System name is :"+Os_Name);
		System.out.println("User name is "+User_Name);
		
		
	}

}
