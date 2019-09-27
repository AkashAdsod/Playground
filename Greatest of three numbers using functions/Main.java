import java.util.Scanner;
class Main{
  	public static int find_greatest(int x, int y){
      if(x>y)
        return x;
      else
        return y;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      System.out.println(find_greatest(find_greatest(a,b),c));
	}
}