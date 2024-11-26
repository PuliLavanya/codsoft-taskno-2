import java.util.*;
class Marks{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks out of 100 :");
System.out.println("Maths:");
int a=sc.nextInt();
System.out.println("science:");
int b=sc.nextInt();
System.out.println("English:"); 
int c=sc.nextInt();
int sum=0;
sum=a+b+c;
System.out.println("sum of the marks:"+sum);
int n=3;
int avg=sum/n;
System.out.println("Average of the marks:"+avg+"%");
if(avg>=90)
{
System.out.println("O grade");
}
else if(avg<=89 && avg>=70)
{
System.out.println("A grade.");
}
else if(avg<=69 && avg>=50)
{
System.out.println("B grade.");
}
else
{
System.out.println("Fail."); 
}
}
}