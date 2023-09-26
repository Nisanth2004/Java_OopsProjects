import java.lang.*;
import java.util.*;
class new10
{
	public static void main(String arg[])
	{
		System.out.println("CIT Student login");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter User name : ");
		String a=s.nextLine();
		System.out.println("Enter password : ");
		String b=s.nextLine();
		switch(a)
		{
			case "Nisanth" :
			switch(b)
			{
				case "hari123":System.out.println("Login Success");
				break;
				
				default:System.out.print("incorrect password");
				break;
			}
			break;
			
			default:
			switch(b)
			{
				case "nisanth@1234":System.out.println("invalid user name");
				break;
				
				default:System.out.print("invalid username and password");
				break;
			}
			break;
		}  		
	}
}