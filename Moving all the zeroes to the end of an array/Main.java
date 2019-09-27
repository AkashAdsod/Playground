import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    int temparr[] = new int[n];
    for(int i = 0; i < n; i++){
      list[i] = in.nextInt();
     }
      int zero_cunt = 0;
      int j=-1;
      for(int i=0; i<n; i++){
        if(list[i] == 0){
          zero_cunt++;
        }else{
          j++;
          temparr[j] = list[i];
        }
      }
      for(int i = 0; i < n; i++){
        System.out.print(temparr[i] + " ");
     }
    }
}