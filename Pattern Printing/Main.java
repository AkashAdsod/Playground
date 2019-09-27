import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int col = in.nextInt();
      int[] arr = new int[row];
      for(int i=0; i<row; i++){
        arr[i] = row;
      }
      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
          System.out.print(arr[j]);
        }
        System.out.println();
        for(int j=i+1; j<col; j++){
          --arr[j];
        }
      }
    }
}