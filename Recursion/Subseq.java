package Recursion;

public class Subseq {
    public static void subsequences(int idx, String str, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subsequences(idx+1, str, newString+currChar);
        //not to be
        subsequences(idx+1, str, newString);
    }
    public static void main(String[] args) {
        subsequences(0, "abc", "");
    }
}
