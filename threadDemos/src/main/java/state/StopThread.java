package state;

/**
 * 测试停止线程
 * 建议：1.应该正常停止线程，不要使用死循环
 * 2.使用标志位结束线程
 * 3.不要使用Thread自带的stop()或者destroy()方法强制结束线程
 */
public class StopThread implements Runnable {
    private boolean flag = true; //设置一个标志位

    public void run() {
        while (flag) {
            System.out.println("thread running");
        }
    }

    /**
     * 设置一个方法修改标志位
     */
    private void stopRunning() {
        this.flag = false;
        System.out.println("转换标志位,关闭线程");
    }

    public static void main(String[] args) {
        StopThread stopThread = new StopThread();
        Thread thread = new Thread(stopThread);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("即将关闭线程" + i);

        }
        stopThread.stopRunning();
    }
}
