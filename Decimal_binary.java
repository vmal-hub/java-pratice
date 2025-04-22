public class Decimal_binary{

public static void main(String[]args)
{
int no=8;
String binary="";
  
  while(no>0){

binary=(no%2)+binary;
no=no/2;

}
System.out.println(binary);
}
//System.out.println(binary);
}
