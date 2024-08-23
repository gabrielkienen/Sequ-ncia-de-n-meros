import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a sequence of numbers: ");
    String input = scanner.nextLine();
    String reversedInput = new StringBuilder(input).reverse().toString();
    System.out.println("Reversed sequence: " + reversedInput);
  }
} 