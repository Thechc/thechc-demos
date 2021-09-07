package how2create;

import java.util.concurrent.*;

/**
 * 第三种创建线程方法  实现callable接口
 */
public class MyCallable implements Callable<String> {
    public String call() throws Exception {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 50; i++) {
            System.out.println(name + "打印" + i);
        }
        return name;
    }

    public static void main(String[] args) throws Exception {
        MyCallable myCallable1 = new MyCallable();
        MyCallable myCallable2 = new MyCallable();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> submit1 = executorService.submit(myCallable1);
        Future<String> submit2 = executorService.submit(myCallable2);

        System.out.println(submit1.get());
        System.out.println(submit2.get());

        executorService.shutdown();
    }
}
