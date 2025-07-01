import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();
        System.out.println("You have 5 seconds to enter your name");
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Hello"+name);
        in.close();
    }
}