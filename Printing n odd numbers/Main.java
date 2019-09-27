import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int cunt=0;
      for(int i=1; i<=n*2; i++){
        if(cunt==n)
          break;
        else
          if(i%2==1){
            System.out.println(i);
            cunt++;
          }
      }
	}
}