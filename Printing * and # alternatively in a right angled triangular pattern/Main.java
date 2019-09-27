import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int cunt=1;
      
      for(int i=1; i<=n; i++){
        for(int j=i; j>0; j--){
          if(cunt%2==1)
            System.out.print("*");
          else
            System.out.print("#");
          cunt++;
        }
        System.out.print("\n");
      }
    }
}