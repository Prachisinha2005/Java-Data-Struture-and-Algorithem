import java.net.SocketTimeoutException;
import java.util.*;

public class Strings { 
    
    //public static void printLetters(String str){
      
        //for(int i=0;i<str.length();i++){
          //  System.out.println(str.charAt(i)+" ");
       // }
       //public static boolean isPalindrome(String str){
       //    for(int i=0;i<str.length()/2;i++){
       //       int n = str.length();
       //       if(str.charAt(i) != str.charAt(n-1-i)) {
       //         return false;
//
       //       }
//
       //    }
       //    return true;
       //}
      //  public static float getShortestpath(String path){
      //   int x = 0;
      //   int y=0;
      //   for(int i=0;i<=path.length();i++){
      //       char dir = path.charAt(i);
      //        //south
      //        if(dir =='S'){
      //           y--;
      //        }
      //        //North
      //        else if(dir =='N'){
      //           y++;
      //        }
      //        //East
      //        else if(dir =='E'){
      //           x++;
      //        }
      //        //west
      //        else{
      //           x--;
      //        }

      //   }
      //   int x2=x*x;
      //   int y2 = y*y;
      //   return (float)Math.sqrt(x2 + y2);

      //  }
    public static String toUpperCase(String str){
      StringBuilder sb = new StringBuilder("");

      char ch = Character.toUpperCase(str.charAt(0));
      sb.append(ch);

      for(int i =0;i<str.lenght();i++){
         if(str.charAt(i) == ' ' && str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(character.toUpperCase(str.charAt(i))); 
         }else{
            sb.append(str.charAt(i));
         }
         return sb.toString();
      }
    }
   public static void main (String args[]) {
       //String fullname =  " tony sharnk";
       //System.out.println(fullname.length());
       //concatenation
       //String firstname = " Prachi";
       //String lastname= " Sinha";
       //String Fullname = firstname + " " + lastname;
       //System.out.println(Fullname.charAt(1));
       //pri ntLetters(Fullname);
       //String str = "racecar";
       //System.out.println(isPalindrome(str));
      // String path = "WEENESENNN";
       //System.out.println(getShortestpath(path));
      //  String fruits[] = {"apple","mango", "banana"};

      //  String largest = fruits[0];
      //  for(int i = 1;i<fruits.length;i++){
      //      if(largest.compareTo (fruits[i])<0) {
      //         largest = fruits[i];   
      //       }
      //  }
      //  System.out.println(largest);
      // StringBuilder sb = new StringBuilder("");
      // for(char ch ='a' ; ch<='z';ch++ ){
      //    sb.append(ch);  
      // }
      // System.out.println(sb);
      System.out.println(toUpperCase(str));


   }

}  

