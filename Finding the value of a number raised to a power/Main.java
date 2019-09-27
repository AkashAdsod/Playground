import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int expo = in.nextInt();
      int result = 1;
      while(expo>0){
        result *= base;
        expo--;
      }
      System.out.println(result);
    }
}