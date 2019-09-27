import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int index1=-1;
      int index2=-1;
      
      int index = in.nextInt();
      int array[] = new int[index];
      
      for(int i=0; i<index; i++){
        array[i] = in.nextInt();
      }
      
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      
      for(int i=0; i<index; i++){
        if(array[i] == n1){
          index1 = i;
        }
        if(array[i] == n2){
          index2 = i;
        }
      }
      System.out.println(index1+"\n"+index2);
    }
}