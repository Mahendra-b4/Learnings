package Threads.addSubSyncMethod;

public class Count {
//    public int count = 0;
    private static int value = 0;

    public static synchronized void incrementValue(int i){
        value += i;
    }

    public static int getValue(){
        return value;
    }
}
