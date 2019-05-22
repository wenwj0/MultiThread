package chapter_1;

public class WelcomeApp1 {
    public static void main(String[] args) {
        Thread welcomeThread = new Thread(new WelcomeTask());
        welcomeThread.start();
        System.out.println("1.Welcome, I am: " + Thread.currentThread().getName());
    }
}
class WelcomeTask implements Runnable{
    @Override
    public void run() {
        System.out.println("2.Welcome, I am: " + Thread.currentThread().getName());
    }
}
