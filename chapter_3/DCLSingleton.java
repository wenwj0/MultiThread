package chapter_3;

public class DCLSingleton {
    private static volatile DCLSingleton instance = null;
    private DCLSingleton(){}
    public static DCLSingleton getInstance(){
        if(null == instance){
            synchronized (DCLSingleton.class){
                if(null == instance){
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
