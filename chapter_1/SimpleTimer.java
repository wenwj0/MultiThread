package chapter_1;

public class SimpleTimer {
    private static int count = 0;
    public static void main(String[] args) {
        count = args.length < 1?600:Integer.parseInt(args[0]);
        Thread t = new Thread(new Timer());
        t.start();
    }
    static class Timer implements Runnable{
        @Override
        public void run() {
            while(true) {
                if(count>=0) {
                    try {
                        System.out.println("Now is: " + count);
                        decrement();
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else break;
            }
        }
    }
    private static void decrement(){
        count--;
    }
}
