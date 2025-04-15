public class Perfectno{

  public static void main(String[]args)
{


int no=28;
int div=1;
int sum=0;
 while(div<no)
 {
if(no%div==0)
{
 sum=sum+div;
}
div=div+1;
}
if(sum==no)
 System.out.println("perfect");
else
 System.out.println("not-perfect");
}
}
