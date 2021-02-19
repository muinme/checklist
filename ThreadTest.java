public class ThreadTest {

    static class PrintThread extends Thread {
        private int sleepTime;
        public PrintThread( String name ){
            super( name );
            sleepTime = (int)(Math.random()*5000);
            System.out.println( getName() +
                    " have sleep time: " + sleepTime);
        }
        public void run(){
            try{
                System.out.println(getName()+"starts to sleep");
                        Thread.sleep( sleepTime );
            }
//  một chuỗi đang chờ, đang ngủ hoặc bị chiếm dụng, và chuỗi bị gián đoạn, trước hoặc trong khi hoạt động
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println( getName() + " done sleeping" );
        }
    }
    public static void main( String [ ] args ){
        PrintThread thread1 = new PrintThread( "thread1" );
        PrintThread thread2 = new PrintThread( "thread2" );
        PrintThread thread3 = new PrintThread( "thread3" );
        System.out.println( "Starting threads" );
        thread1.start();  //start and ready to run
        thread2.start();
        thread3.start();
        System.out.println( "Threads started, main ends\n" );
    }
}
