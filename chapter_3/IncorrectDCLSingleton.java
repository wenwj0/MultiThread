package chapter_3;

public class IncorrectDCLSingleton {
    private static IncorrectDCLSingleton instance = null;
    private IncorrectDCLSingleton(){}
    public static IncorrectDCLSingleton getInstance(){
        if(null == instance){
            synchronized (IncorrectDCLSingleton.class){
                if(null == instance){
                    instance = new IncorrectDCLSingleton();
                }
            }
        }
        return instance;
    }
}
