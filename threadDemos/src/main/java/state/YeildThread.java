package state;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 线程礼让：
 *          线程礼让是让当前线程暂停，但不阻塞
 *          将线程的状态转为就绪状态
 *          CPU会重新调度，礼让不一定会成功，可能CPU还是会把临界区分配给之前礼让出来的线程
 */
public class YeildThread {
    public static void main(String[] args) {
        MyYeild myYeild = new MyYeild();
        new Thread(myYeild,"A").start();
        new Thread(myYeild,"B").start();
    }
}

class MyYeild implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"--stop");
    }
    /*
    礼让成功                 礼让失败
    A--start                A--start
    B--start                A--stop
    A--stop                 B--start
    B--stop                 B--stop

     */
}
