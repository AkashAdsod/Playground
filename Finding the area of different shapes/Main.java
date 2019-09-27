import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int input = in.nextInt();
      switch(input){
        case 1:
          int side = in.nextInt();
          System.out.println(side*side);
          break;
        case 2:
          int length = in.nextInt();
          int breath = in.nextInt();
          System.out.println(length*breath);
          break;
        case 3:
          int base = in.nextInt();
          int height = in.nextInt();
          System.out.println(0.5*base*height);
          break;
        case 4:
          int radius = in.nextInt();
          System.out.println(3.14*radius*radius);
          break;
        default:
          System.out.println("Invalid Case");
          break;
      }
    }
}