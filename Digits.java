public class Digits{
  public static void main(String[]args){

int num = 768;
if (num < 10) {
    System.out.println("1-digit number");
} else if (num < 100) {
    System.out.println("2-digit number");
} else if (num < 1000) {
    System.out.println("3-digit number");
} else {
    System.out.println("4-digit number");
}
}
}
