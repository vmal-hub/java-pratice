public class Well{

  public static void main(String args[]){

int total=50;
 int day=0;
int up=3;
int down=1;
int position=0;
 while(position<total)
{
 position = position+(up-down);
  day=day+1;
System.out.println(day);
}
//System.out.println(day);
}
}
