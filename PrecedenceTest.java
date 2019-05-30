import java.util.Scanner;

class PrecedenceTest {
  public static void main(String... arg) {
    // Scanner in = new Scanner(System.in);

    // || does have higher precedence over ?:
    // Following line prints 'true part of ternary'
    System.out.println(true || true ? "true part of teranry" : "false part of ternary");
  }
}
