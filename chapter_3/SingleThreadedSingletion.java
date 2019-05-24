package chapter_3;

public class SingleThreadedSingletion {
    private static SingleThreadedSingletion instance = null;
    private SingleThreadedSingletion(){

    }
    public static SingleThreadedSingletion getInstance(){
            if (instance == null) {
                instance = new SingleThreadedSingletion();
            }
        return instance;
    }

}
