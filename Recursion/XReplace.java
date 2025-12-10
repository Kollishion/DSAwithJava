package Recursion;

public class XReplace {
    public static void moveAllX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i = 0; i<count; i++){
                newString += 'X';
            }
            System.out.println(newString);
            return;
        }else{
        char currChar = str.charAt(idx);
            if(currChar == 'X'){
                count++;
                moveAllX(str, idx+1, count, newString);
            }
            else{
                newString += currChar;
                moveAllX(str, idx+1, count, newString);
            }
        }
    }
    public static void main(String[] args) {
        moveAllX("ABXCDEFXXG", 0, 0, "");
    }
}
