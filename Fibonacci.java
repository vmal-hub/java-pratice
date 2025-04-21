public class Fibo
{
public static void main (String[]args)
{

int f=-1;
int s=1;
int t=0;

while(t<13){

t=f+s;
System.out.println(t);
f=s;
s=t;


}
}
}
