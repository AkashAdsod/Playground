import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      int numberOfParts = in.nextInt();
      String replaceString = str1.replace(str1,str2);
      int len = replaceString.length();
      for(int i=0; i<len; i++){
        System.out.print(replaceString.charAt(i));
        if(replaceString.charAt(i) == ' '){
          System.out.println();
          continue;
        }
      }
    }
}