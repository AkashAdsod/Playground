import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = in.nextInt();
      }
      int count = 0;
      for(int j=1; j<=k; j++){
        for(int i=0; i<n; i++){
          if(arr[i] == j){
            count++;
          }
        }
        System.out.println(j+" "+count);
        count=0;
      }
    }
}