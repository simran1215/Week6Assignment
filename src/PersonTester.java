import java.util.Scanner;

public class PersonTester {
	public static void main(String [] args)
	{
		//Person johndoe = new Person();
		//Person maryjones = new Person("Mary", "Jones");
		//System.out.println("John Doe: " + johndoe);
		//System.out.println("Mary Jones: " + maryjones);
		
		//PaidAdvisor consultant = new PaidAdvisor();
		
		//PaidAdvisor janesmith = new PaidAdvisor("Jane", "Smith", 30);
		//System.out.println(janesmith.getFirstName());
		//System.out.println(janesmith);
		
		//janesmith.setNameRateHours("Janice", "Schmidt", 32, 40);
		//System.out.println(janesmith);
		
		
		Scanner sc = new Scanner(System.in);
		PaidAdvisor employee = new PaidAdvisor();
		employee.setName("(Nameless", "drone)");
		int choice = 0;
		while(choice != 9)
		{
			System.out.println("");
			System.out.println("1) Display Employee");
			System.out.println("2) Set Name");
			System.out.println("3) Set Rate");
			System.out.println("4) Set Hours");
			System.out.println("5) Set Special Hours");
			System.out.println("9) Quit");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1)
			{
				System.out.println(employee);
			}
			else if(choice == 2)
			{
				System.out.println("What is the first name?");
				String firstName = sc.nextLine();
				System.out.println("What is the last name?");
				String lastName = sc.nextLine();
				
				employee.setName(firstName,  lastName);
			}
			else if(choice == 3)
			{
				System.out.println("What is the base hourly rate?");
				int rate = sc.nextInt();
				sc.nextLine();
				employee.setRate(rate);
			}
			else if(choice == 4)
			{
				System.out.println("What is the total hours worked (not including special hours)?");
				int worked = sc.nextInt();
				sc.nextLine();
				employee.setHours(worked);				
			}
			else if(choice == 5)
			{
				System.out.println("How many special hours were worked?");
				int worked = sc.nextInt();
				sc.nextLine();
				employee.setSpecialHours(worked);				
			}
			else if(choice == 9)
			{
				System.out.println("Exiting.");
			}
			
		}
		
	}

}



