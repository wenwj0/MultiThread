package chapter_3;

public class SimpleMultithreadedSingleton {
    private static SimpleMultithreadedSingleton instance = null;
    private SimpleMultithreadedSingleton(){}
    public static SimpleMultithreadedSingleton getInstance(){
        synchronized (SimpleMultithreadedSingleton.class){
            if(null == instance){
                instance = new SimpleMultithreadedSingleton();
            }
        }
        return instance;
    }
}
