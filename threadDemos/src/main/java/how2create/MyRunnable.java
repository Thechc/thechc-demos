package how2create;

/**
 * 第二种创建线程的方式实现Runnable接口  重写run方法
 */
public class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("run方法打印" + i);
        }
    }

    public static void main(String[] args) {
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main方法打印" + i);
        }
    }
}
