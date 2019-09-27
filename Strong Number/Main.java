import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int digit = 0;
      int strongnum = 0;
      
      while(temp!=0){
        temp/=10;
        digit++;
      }
      temp = n;
      for(int i=0; i<digit; i++){
        int fact=1;
        int cunt = temp%10;
        temp /= 10;
        
        for(int j=1; j<=cunt; j++)
          fact *= j;
        
        strongnum += fact;
      }
      if(n == strongnum)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}