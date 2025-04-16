public class Strongno {



 public static void main(String[]args)
{
int no=145;
 Strongno sn= new Strongno();
 
int result=sn.find_strong(no);

if(result==no)
System.out.println("strong no");

else
System.out.println("not strong no");

}
 
 int find_strong(int no)
{
int sum=0;
 
  while(no>0){
int rem=no%10;
 
 int fact=find_fact(rem);
sum=sum+fact;
 no=no/10;
}
System.out.println(sum);

 return sum;
}

int find_fact(int no)
{
int fact=1;

 while(no>0)
{
fact=fact*no;
no=no-1;
}
return fact;

//System.out.println(fact);
}
}







