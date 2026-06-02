import java.util.Scanner;
class luckyfour
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
while(T>0)
{
int N=sc.nextInt();
int count=0;
while(N>0)
{
int digit=N%10;
if(digit==4)
{
count++;
}
N=N/10;
}
System.out.println(count);
}
}
}