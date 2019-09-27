import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = in.nextInt();
      }
      int k = in.nextInt();
      int larEle = 0;
      
      for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
          if(arr[i] > arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
      }
      
      for(int i=n-1; i>=0; i--){
        //System.out.print(arr[i]+" ");
        larEle++;
        if(larEle == k){
          System.out.print(arr[i]);
          break;
        }
      }
      
    }   
}