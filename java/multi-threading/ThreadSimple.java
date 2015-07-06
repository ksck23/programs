class ThreadSimple extends Thread {

    public void run () {

        for (int i=1; i<=5; i++) {

            try {
                Thread.sleep(500*i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Thread: " + Thread.currentThread().getName() + " (priority " + Thread.currentThread().getPriority() + "): " + i);
        }
    }

    public static void main (String args[]) {

        ThreadSimple t1 = new ThreadSimple();

        ThreadSimple t2 = new ThreadSimple();

        t1.setName("Counter1");
        t2.setName("Counter2");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Starting Thread: " + t1.getName());
        System.out.println("Starting Thread: " + t2.getName());

        t1.start();
        t2.start();
    }
}
