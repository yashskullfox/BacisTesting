import java.util.Scanner;
class pattern1
{
public static void main(String args[])
{	
	int num=0;
	Scanner r=new Scanner(System.in);
	System.out.println("Enter number to parint * ");
	num=r.nextInt();

	for(int i=0;i<num;i++)
	{


		for(int l=1;l<num-i;l++)
		{
		System.out.print(" ");
		}

	for(int m=0;m<=i;m++)
	{
	System.out.print("* ");
	}	
/*
		for(int k=0;k<i;k++)
		{
		System.out.print(" ");
		}

	for(int j=0;j<(num-i)-1;j++)
	{
	System.out.print("* ");
	}
*/
	System.out.println("");
	}

	for(int i=0;i<num;i++)
	{
		for(int k=0;k<=i;k++)
		{
		System.out.print(" ");
		}

	for(int j=0;j<(num-i)-1;j++)
	{
	System.out.print("* ");
	}

	System.out.println("");
	}
}
}

