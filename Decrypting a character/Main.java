import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      
      if(ch >= 'a' && ch<= 'z'){
        int temp = ch - 'a';
        temp = (temp - key) % 26;
        if(temp < 0){
          ch = (char) ('z' + ++temp);
        }else{
          ch = (char) ('a' + temp);
        }
      }else if(ch >= 'A' && ch <='Z'){
        int temp = ch - 'A';
        temp = (temp - key) % 26;
        if(temp < 0){
          ch = (char) ('Z' + ++temp);
        }else{
          ch = (char) ('A' + temp);
        }
      }
      System.out.println(ch);
    }
}