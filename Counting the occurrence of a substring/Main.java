import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      //StringBuilder rev_str = new StringBuilder(str);
      int str1_Len = str1.length();
      int str2_Len = str2.length();
      int matchCount = 0;
      
      for(int i=0; i<(str1_Len - str2_Len + 1); i++){
        for(int j=0; j<str2_Len; j++){
          if(str1.charAt(i + j) == str2.charAt(j)){
            matchCount++;
          }
        }
      }
      System.out.println(matchCount/str2_Len);
    } 
}