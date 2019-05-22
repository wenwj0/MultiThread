package chapter_2;

public class ThreadJoinVisibility {
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
                data = 1;
            }
        };
        thread.start();
        System.out.println("1.data is: "+ data);
        try{
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("2.data is: "+ data);
    }
}
