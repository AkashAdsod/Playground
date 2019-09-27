import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      for(int i=1; i<=n; i++){
        for(int space=n-i; space>0; space--)
          System.out.print(" ");
        for(int j=1;j<=(i*2)-1; j++){
          System.out.print("*");
        }
        System.out.println();
      }
	}
}