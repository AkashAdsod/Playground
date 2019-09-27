import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
    int rev  = ((n%10)*100)+(((n%100)/10)*10)+(n/100);
      System.out.println(rev);
  }
}