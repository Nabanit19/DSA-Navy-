import java.util.Scanner;
class PalindromeStringWithTwoPointers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(validPalindrome(str));
    }
    private static boolean validPalindrome(String str){
        str=str.toLowerCase();
        int len=str.length();
        int left=0,right=len-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)) return false;
            left++;right--;
        }
        return true;
    }
}