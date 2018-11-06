public class q13 {

    static class Newthread implements Runnable{
        Thread t;
        @Override
        public void run() {
            for (int i=0;i<10;i++){

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
        Newthread(){

            t = new Thread(this);
            t.start();
        }
    }
   static class  secondthread extends Thread{
        @Override
        public void run() {
            super.run();
            for (int i=0;i<10;i++){

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("3 thread");
            }
        }
    }

    public static void main(String[] args) {
        Newthread newthread= new Newthread();
        secondthread second= new secondthread();
        second.start();
        try {
            for (int i=0;i<4;i++){
                System.out.println("main thread");
                Thread.sleep(100);
            }
            newthread.t.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
