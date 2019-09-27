import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = 1;
      for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
          if(i%2==1){
            if(j!=n)
              System.out.print(k);
            else
              System.out.print(++k);
          }else{
            if(j==1)
              System.out.print(++k);
            else
              System.out.print(k-1);
          }
        }
        System.out.println();
      }
	}
}