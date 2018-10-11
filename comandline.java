import 	java.util.Scanner;
class comandline
{
public static void main(String args[])
{
int a,b,ch,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
Scanner s=new Scanner(System.in);
ch=s.nextInt();
while(true)
{
System.out.println("Enter your choice");
System.out.println("1-->add");
System.out.println("2-->sub");
System.out.println("3-->mul");
System.out.println("4-->div");
switch(ch)
{
	case 1:
		c=a+b;
		System.out.println("a+b is:"+c);
		break;
	case 2:
		c=a-b;
		System.out.println("a-b is:"+c);
		break;
	case 3:
		c=a*b;
		System.out.println("a*b is :"+c);
		break;
	case :
		c=a/b;
		System.out.println("a/b is:"+c);
		break;
		default:
		System.out.println("invalid choice");
}
}
}
}