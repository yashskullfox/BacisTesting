import java.util.Scanner;
class fibonaci
{
public static void main(String args[])
{
int a=0;
int b=1,sum;
int num=0;
System.out.println("enter value for fibonaci serise:");
Scanner r=new Scanner(System.in);
num=r.nextInt();
System.out.print(a+" "+b+" ");
for(int i=0;i<num;i++)
{
sum=a+b;
System.out.print(" "+sum);
a=b;
b=sum;
}
}
}