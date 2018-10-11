import java.util.Scanner;
class pattern4
{
public static void main(String args[])
{
	int num=0;
	Scanner r=new Scanner(System.in);
	System.out.println("Enter number to parint * ");
	num=r.nextInt();

	for(int i=0;i<num;i++)
	{
		for(int l=(num-i)*2;l>0;l--)
		{
		System.out.print(" ");
		}
	for(int j=0;j<=i;j++)
	{
	
	System.out.print("* ");
	}

	System.out.println("");
	}

	
	for(int i=0;i<num;i++)
	{
	
		for(int l=0;l<i+2;l++)
		{
		System.out.print("  ");
		}
	for(int m=num-1;m>i;m--)
	{
	System.out.print("* ");
	}
	System.out.println("");
	}


}
}

