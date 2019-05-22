package chapter_1;

public class WelcomeApp {
    public static void main(String[] args) {
        Thread welcomeThread = new WelcomeThread();
        welcomeThread.start();
        System.out.println("1.Welcome, I am "+Thread.currentThread().getName());
    }


}
class WelcomeThread extends Thread{
    @Override
    public void run() {
        System.out.println("2.Welcome, I am: "+ Thread.currentThread().getName());
    }
}