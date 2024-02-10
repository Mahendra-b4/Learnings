package Threads.creating1stThread;

public class ClientTable {
    public static void main(String args[]){
        int x = 5;

//        for(int i=1 ; i<10 ; i++){
            TableCreator tc = new TableCreator(x);

            Thread st = new Thread(tc);

            st.start();
//        }
    }
}
