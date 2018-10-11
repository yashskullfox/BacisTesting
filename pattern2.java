import java.util.Scanner;
class pattern2
{
public static void main(String args[])
{	int num=0;
	Scanner r=new Scanner(System.in);
	System.out.println("Enter number to parint * ");
	num=r.nextInt();
	for(int i=0;i<num;i++)
	{
	
		for(int l=0;l<i;l++)
		{
		System.out.print("  ");
		}
	for(int m=num;m>i;m--)
	{
	System.out.print("* ");
	}
	System.out.println("");
	}
}
}