import java.util.Scanner;

public class Sum{
  public static void main(String[] args) {
      System.out.println("Hello worlds");
      Sum sum = new Sum();
      sum.sum();
  }

    public static void sum(){
      int a,b,c;
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter first number");
      a = sc.nextInt();

      System.out.println("Enter Second Number");
      b = sc.nextInt();

      c = a + b;
      System.out.println("Sum: "+c);
    }
}
