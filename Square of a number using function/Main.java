import java.util.Scanner;
class Main
{
  	public static int square_of_num(int n){
      return(n * n);
    }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sqr = square_of_num(n);
      System.out.println(sqr);
	} 
}