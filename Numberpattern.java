public class Numberpattern
{
public static void main(String[]args)
{
for(int row=1; row<=5; row++)
{
for(int col=1; col<=row; col++)
{
System.out.print(col+" ");
}
System.out.println();
}
//System.out.println();

for(int i=4; i>=1; i--)
{
for(int j=1; j<=i; j++)
{
System.out.print(j+ " ");
}
System.out.println();
}
}
}

