package Recursion;

public class Hanoi {
    public static void hanoi_rec(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer the disk "+n+" from "+src+" to "+dest);
            return;
        }
        hanoi_rec(n-1, src, dest, helper);
        System.out.println("Transfer the disk "+n+" from "+src+" to "+dest);
        hanoi_rec(n-1, helper, src, dest);
        }
    public static void main(String[] args){
        int n = 3; 
        String from = "A";
        String to = "B";
        String via = "C";
        hanoi_rec(n, from, via, to);
    }    
}