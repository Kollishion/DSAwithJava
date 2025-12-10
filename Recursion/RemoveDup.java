package Recursion;

public class RemoveDup {
    public static boolean[] map = new boolean[26];
    public static void DupRemove(int idx, String str, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            DupRemove(idx+1, str, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            DupRemove(idx+1, str, newString);
        }
    }
    public static void main(String[] args) {
        DupRemove(0, "abbccda", "");
    }
}
