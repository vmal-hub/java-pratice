public class Reverse
{
 
  public static void main(String[]args)
{
int no=424;
  Reverse r1= new Reverse();
 int result=r1.find_palindrome(424);

if(no==result)
System.out.println("palindrome");
  else
 System.out.println("not a palindrome");


}
int find_palindrome(int no)
 {
   int reverse=0; 
while(no>0)
{
 int rem=no%10;
  reverse=(reverse*10)+rem;
  no/=10;
}
System.out.println("Number=> "  + reverse);
  return reverse;
}
   }
      
