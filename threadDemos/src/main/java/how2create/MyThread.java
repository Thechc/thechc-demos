package how2create;

/**
 * 第一种创建多线程方式 继承Thread类 重写run方法
 *
 * 多次运行会发现线程是交叉执行的，并不是串行的
 * 注意： 如果调用run方法是直接运行run方法，调用start才是启动线程
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("run方法打印" + i);
        }
    }

    public static void main(String[] args) {
        MyThread testThread1 = new MyThread();
        testThread1.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main方法打印" + i);
        }
    }
}
