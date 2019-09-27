import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder rev_str = new StringBuilder(str);
      String str2 = "";
      int strLen = str.length();
      int front = 0;
      int end = strLen-1;
      while(front < end){
        char temp = str.charAt(front);
        rev_str.setCharAt(front,str.charAt(end));
        rev_str.setCharAt(end,temp);
        front++;
        end--;
      }
      if(str.equals(rev_str.toString()) == true){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    } 
}