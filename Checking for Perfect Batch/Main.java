import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    int presum = 0, sum = 0;
    for(int i=0; i<n; i++){
      list[i] = in.nextInt();
    }
    for(int i=0; i<=n; i++){
      if(i%3==0){
        if(i > 3){
          if(presum != sum){
            System.out.println("Not a Perfect Batch");
            break;
          }else if(i == n && presum == sum){
            System.out.println("Perfect Batch");
            break;
          }
        }
        presum = sum;
        sum = 0;
      }
       sum += list[i];
    }
  }
}