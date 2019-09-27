import java.util.Scanner;
class Main{
  	public static int find_prime(int n){
      int cunt = 0;
      for(int j=1; j<=n; j++){
        if(n%j==0)
          cunt++;
       }
      if(cunt==2)
        return n;
      else
        return 0;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      for(int i=2; i<=n; i++){
        int prime = find_prime(i);
        if(prime!=0)
          System.out.println(prime);
      }
	}
}