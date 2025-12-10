package Recursion;

import java.util.HashSet;

public class Uniq_Sub {
    public static void subsequences(int idx, String str, String newString, HashSet<String> map){
        if(idx == str.length()){
            if(map.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                map.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to be
        subsequences(idx+1, str, newString+currChar, map);
        //not to be
        subsequences(idx+1, str, newString, map);
    }
    public static void main(String[] args) {
        HashSet<String> map = new HashSet<>();
        subsequences(0, "aaa", "", map);
    }
}
