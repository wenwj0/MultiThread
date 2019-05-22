package chapter_2;

public class ThreadStartVisibility {
    public static int data = 0;
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(50);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("1.data is: "+ data);
            }
        };
        data = 1;
        thread.start();
        try{
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(50);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        data = 2;
        System.out.println("2.data is: "+data);
    }
}
