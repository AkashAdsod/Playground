import java.util.Scanner;
public class Main{
	public static int find_gcd(int x, int y){
      int minterm;
      int gcd;
      if(x>y)
        minterm = y;
      else
        minterm = x;
      for(int i=minterm; i>0; i--){
        if(x%minterm==0 && y%minterm==0){
          gcd = minterm;
          break;
        }
      }
      return minterm;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      System.out.println(find_gcd(find_gcd(a,b),c));
      
	}
}