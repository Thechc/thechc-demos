package state;


import java.time.LocalDateTime;
/**
 * 线程休眠
 */
public class SleepThread {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("聚气5秒准备发射龟派气功："+LocalDateTime.now());
            Thread.sleep(5000);
            System.out.println("发射龟派气功："+ LocalDateTime.now());
        }
    }
}
