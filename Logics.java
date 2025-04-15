public class Logics
{
 public static void main (String[]args)
{

Logics log = new Logics();

int no=153;

 int count=log.find_count(no);
int result=log.find_amstrong(no,count);
if (result==no)
System.out.println("AMSTRONG");
else
System.out.println("NO AMSTRONG");
}
public int find_count(int no)
{
int count =0;
while(no>0)
{
count=count+1;
no/=10;
}
return count;
}
 int find_amstrong(int no, int power)
   {
int sum=0;
while(no>0)
  {
int rem=no%10;
 int result=find_power(rem,power);
sum+=result;
no=no/10;
}
 return sum;
}
public int find_power(int base,int power)
{
int result=1;
while(power>0)
{
result=result*base;
power-=1;
}
 return result;
}
}




























