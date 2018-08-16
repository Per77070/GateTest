import java.util.Scanner;

public class EnterPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int P=0;
int n=1567;	
int x=0;	
int q=0;
Scanner scanner =new Scanner(System.in);

while(P!=n)
{
		System.out.println("Type a Pin code. ");
	
	
	P= scanner.nextInt();
	
	
	if(P==1567)
	{
		System.out.println("The code is correct");
		return;
	}
	
	else
		
	{
		System.out.println("The code is incorrect, please try again.");
		q+=q;
	
	
	
	}

	

}
if(q==6);
{

	System.out.println("Too many tries.");
}
	
		
	
	scanner.close();
	}}
	
	
	


