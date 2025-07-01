package Strings;

public class CheckPalindrome {
    public static Boolean isPalindrome(String word){
        char[]wordArray = word.toCharArray();
        int start =0;
        int end = word.length()-1;
        while(start<end){
            if(wordArray[start]!=wordArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String word ="shylock";
        boolean palindrome = isPalindrome(word);
        System.out.println("Is the word "+"'"+word+"'"+" is a Palindrome --> "+palindrome);
    }
}
