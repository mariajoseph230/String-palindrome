import java.util.Scanner;
class Palindrome{
    public static boolean isPalindrome(String s) {
        int low = 0 , high = s.length()-1;
        while(low<high){
           char l = s.charAt(low) , h = s.charAt(high);
           if(!Character.isLetterOrDigit(l))
            low++;
           else if(!Character.isLetterOrDigit(h))
            high--;
           else {
               if(Character.toLowerCase(l)!=Character.toLowerCase(h))
                return false;
               low++;
                high--;
           }  
        }
        return true;
    }
public  void main (String args[]){
Scanner in=new Scanner(System.in);
String str;
System.out.println("Enter the string");
str=in.nextLine();
System.out.println(isPalindrome(str));

}
}