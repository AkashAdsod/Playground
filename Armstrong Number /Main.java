import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int digit=0;
      int temp = n;
      int armstrong = 0;
      
      while(temp!=0){
        temp /= 10;
        digit++;
      }
      temp = n;
      for(int i=1; i<=digit; i++){
        int result=1;
        int cunt=0;
        cunt = temp % 10;
        temp /= 10;
        for(int j=0;j<digit;j++)
          result *= cunt;
        armstrong += result;
      }
      if(n == armstrong)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}