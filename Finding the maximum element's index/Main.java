import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i = 0; i < n; i++){
      list[i] = in.nextInt();
    }
    int max = list[0];
    int loc = 0;
    for(int i = 0; i < n; i++){
      for(int j = i+1; j < n; j++){
        if(max < list[j]){
          max = list[j];
          loc = j;
        }
      }
    }
	System.out.println(loc);
  }
}