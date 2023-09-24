import java.lang.*;
import java.util.*;
public class BankAtm
{
    public static void main(String args[])
	{
		int a=10000;
		int b;
		int c;
		int d;
		int e;
		int f=9943;
		System.out.println("                                  Welcome to SBI bank");
		System.out.println("");
		System.out.println("Enter your four digit pin : ");
		Scanner ss=new Scanner(System.in);
	    e=ss.nextInt();
		if(e==f)
		{
		while(true)
		{
		    
		    System.out.println("1] Balance enquiry");
		    System.out.println("2] Withdrawal");
		    System.out.println("3] Deposit ");
		    System.out.println("4] recipt");
			System.out.println("5] exit");
		    Scanner s=new Scanner(System.in);
		    b=s.nextInt();
		    switch(b)
		    {
			    case 1 :
			    System.out.println("Balance amount : "+a);
				System.out.println("");
				System.out.println("");
			    break;
			
		        case 2 :
				System.out.println("Enter the amount to withdraw : ");
				c=s.nextInt();
				if(c<=a)
				{
					System.out.println("Collect your cash : "+c);
					a=a-c;
					System.out.println("");
				    System.out.println("");
				}
				else
				{
					System.out.println("Insufficient money");
					System.out.println("");
				    System.out.println("");
				}
				break;
				
				case 3 :
				System.out.println("Enter the amount to deposit : ");
				d=s.nextInt();
				a=a+d;
				System.out.println("Balance : "+a);
				System.out.println("");
				System.out.println("");
				break;
				
				case 4 :
				System.out.println("                                  Indian bank");
				System.out.println("Account no : xxxx xxxx xx98");
				System.out.println("Phone no : 9943322935");
				System.out.println("Balance : "+a);
				System.out.println("Customer support : 8248690154");
				System.out.println("");
				System.out.println("");
				break;
				
				case 5 :
				System.exit(0);
		    }
		}
		}
		else
		{
			System.out.println("Incorrect pin");
		}
	}		
}