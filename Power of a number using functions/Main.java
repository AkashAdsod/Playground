import java.util.Scanner;

class Main{
  public static int find_power(int a, int b){
    int pow = 1;
    for(int i=1; i<=b; i++)
      pow *= a;
    return pow;
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int expo = in.nextInt();
    System.out.println(find_power(base,expo));
  }
}