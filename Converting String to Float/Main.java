import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int len = sb.length();
    int cunt = 0;
    int cunt2 = -1;
    char arr[] = new char[len];
    
    for(int i=0; i<len; i++){
      arr[i] = sb.charAt(i);
      if(arr[i] == '.')
        cunt++;
      if(cunt==1){
        cunt2++;
      }
    }
    if(cunt == 0){
      sb.append('.');
      for(int i=0; i<(5-cunt2); i++){
        sb.append('0');
      }
    }else{
      for(int i=0; i<(6-cunt2); i++){
        sb.append('0');
    }
    }
    System.out.println(sb);
  }
}