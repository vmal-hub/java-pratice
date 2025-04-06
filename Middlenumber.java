public class Middlenumber{
    public static void main(String[]args)
{

int a = 10, b = 15, c = 12;
if ((a > b && a < c) || (a < b && a > c)) {
    System.out.println("Middle: " + a);
} else if ((b > a && b < c) || (b < a && b > c)) {
    System.out.println("Middle: " + b);
} else {
    System.out.println("Middle: " + c);
}
}
}
