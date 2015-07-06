class DaemonThreadSimple extends Thread {

    public void run () {

        if (Thread.currentThread().isDaemon()) { //checking for daemon thread
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }

    public static void main (String args[]) {

        DaemonThreadSimple t1 = new DaemonThreadSimple();

        DaemonThreadSimple t2 = new DaemonThreadSimple();

        t1.setDaemon(true); //now t1 is daemon thread

        t1.start();
        t2.start();
    }
}
