import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int state[] = new int[26];
      char alpha[] = new char[26];
      int strLen = str.length();
      
      for(int i=0; i<26; i++)
        state[i] = 0;
      
      for(int i=0; i<strLen; i++){
        char ch = str.charAt(i);
        int loc;
        if(ch >= 'a' && ch <= 'z'){
          loc = ch - 'a';
          state[loc]++;
        }else if(ch >= 'A' && ch <= 'Z'){
          loc = ch - 'A';
          state[loc]++;
        }
      }
      for(int i=0; i<strLen; i++){
        char ch = str.charAt(i);
        int loc;
        if(ch >= 'a' && ch <= 'z'){
          loc = ch - 'a';
          if(alpha[loc] != ch){
            alpha[loc] = ch;
            System.out.print(str.charAt(i)+""+state[loc]+" ");
          }
        }else if(ch >= 'A' && ch <= 'Z'){
          loc = ch - 'A';
          if(alpha[loc] != ch){
            alpha[loc] = (char) (ch + 32);
            System.out.print((char)(str.charAt(i) + 32)+""+state[loc]+" ");
          }
        }
      }
    }
}