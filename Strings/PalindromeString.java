import java.util.Scanner;
class PalindromeString{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str){
        
        if(str.equals(revStr(str))) return true;
        return false;

    }

    private static String revStr(String str){

        String revStr = "";
        
        int len = str.length();
        for(int i = len-1 ; i >= 0 ; i--){
            revStr += str.charAt(i);
        }

        return revStr;

    }
}