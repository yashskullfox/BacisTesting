import java.util.Scanner;
class percentage
{
public static void main(String args[])
{	int a,b,c,d,e,f;
float sum=0f;
	Scanner r=new Scanner(System.in);
	System.out.println("Enter marks in six subject ");
	a=r.nextInt();
	b=r.nextInt();
	c=r.nextInt();
	d=r.nextInt();
	e=r.nextInt();
	f=r.nextInt();
	sum=(a+b+c+d+e+f)/6;
	System.out.println("percentage is:"+sum);
}
}