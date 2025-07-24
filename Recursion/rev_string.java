package Recursion;

public class rev_string{
    public static void revPrintString(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        revPrintString(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "HOLA";
        int length = str.length()-1;
        revPrintString(str, length);
    }
}