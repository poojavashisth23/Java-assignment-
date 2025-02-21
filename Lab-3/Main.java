public class Main {

  public static void main(String[] args) {

      int a = 10;
      int b = 5;

      System.out.println(a + b);
      System.out.println(a - b);
      System.out.println(a * b);
      System.out.println(a / b);
      System.out.println(a % b);
      System.out.println((~a)^ (~b));

      System.out.println(a == b);
      System.out.println(a != b);
      System.out.println(a > b);
      System.out.println(a < b);
      System.out.println(a >= b);
      System.out.println(a <= b);

      boolean x = true, y = false;
      System.out.println(x && y);
      System.out.println(x || y);
      System.out.println(!x);

      int num1 = 5, num2 = 3;
      System.out.println(num1 & num2);
      System.out.println(num1 | num2);
      System.out.println(num1 ^ num2);
      System.out.println(~num1);
      System.out.println(num1 << 1);
      System.out.println(num1 >> 1);

      int c = 10;
      c += 5;
      System.out.println(c);
      c -= 3;
      System.out.println(c);
      c *= 2;
      System.out.println(c);
      c /= 4;
      System.out.println(c);
      c %= 3;
      System.out.println(c);

      int d = 5;
      System.out.println(++d);
      System.out.println(d++);
      System.out.println(d);
      System.out.println(--d);
      System.out.println(d--);
      System.out.println(d);
  }
}
