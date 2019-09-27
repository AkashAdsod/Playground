import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int strLen = str.length();
      char alpha[] = new char[26];
      int state[] = new int[26];
      char ch = 'a';
      for(int i=0; i<26; i++){
        alpha[i] = ch;
        ch++;
      }
      for(int i=0; i<strLen; i++){
        ch = str.charAt(i);
        int loc;
        if(ch >= 'a' && ch <= 'z'){
          loc = ch - 'a';
          state[loc]++;
        }else if(ch >= 'A' && ch <= 'Z'){
          loc = ch - 'A';
          state[loc]++;
        }
      }
      for(int i=0; i<26; i++){
        if(state[i] == 0)
          System.out.print(alpha[i]+" ");
      }
      
    }
}