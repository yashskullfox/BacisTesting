import java.util.Scanner;
class sumofdigit
{
	public static void main(String args[])
	{
	int num=0,sum=0,c,a;
	System.out.println("enter value for sum of digit of number:");
	Scanner r=new Scanner(System.in);
	num=r.nextInt();
	a=num;
	while(a>0)
	{
	c=a%10;
	sum=sum+c;
	a=a/10;
	}
	
	System.out.println("sum of "+num+" is :"+sum);
	
	}
}