import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = n;
    int cunt = 0;
    StringBuilder sb = new StringBuilder("");
    while(temp != 0){
      cunt++;
      temp=temp/10;
    }
    int pw = cunt;
    if(n<0){
      temp = -n;
    }else{
      temp = n;
    }
    
    for(int i=0; i<cunt; ++i){
      int rem = temp%10;
      temp /= 10;
      sb.append(rem);
    }
    if(n<0)
      sb.append('-');
    System.out.println(sb.reverse());
  }
}