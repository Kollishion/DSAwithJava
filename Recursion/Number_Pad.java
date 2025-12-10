package Recursion;

public class Number_Pad {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printCombo(String str, int idx, String Combination){
        if(idx == str.length()){
            System.out.println(Combination);
            return;
        }
        char currChar = str.charAt(idx);
        String map = keypad[currChar - '0'];
        for(int i = 0; i < map.length(); i++){
            printCombo(str, idx+1, Combination+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        printCombo("23", 0, "");
    }
}
