import java.util.Scanner;
import java.util.Arrays;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = in.nextInt();
    }
    int idx = n/2;
    for(int i=0; i<idx; i++){
      for(int j=i+1; j<idx; ++j){
        if(arr[i] > arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}