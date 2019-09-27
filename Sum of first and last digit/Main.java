import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int last_digit = num % 10;
      int first_digit = num;
      while(num >= 10){
        num = num / 10;
      }
      first_digit = num;
      System.out.println(first_digit + last_digit);
	}
}