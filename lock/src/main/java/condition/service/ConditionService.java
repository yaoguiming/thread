package condition.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Condition实现等待/通知模式
 * @author why
 * @date 2017/6/2 21:56
 */
public class ConditionService {


    private ReentrantLock reentrantLock = new ReentrantLock();

    private Condition condition = reentrantLock.newCondition();

    /**
     * 等待
     */
    public void await() {

        try {
            reentrantLock.lock();
            System.out.println("begin await() ThreadName="
                    + Thread.currentThread().getName());
            condition.await();
            System.out.println("  end await() ThreadName="
                    + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
            System.out.println("当前线程名称：" + Thread.currentThread().getName() + " 锁释放了");
        }

    }

    /**
     * 通知
     */
    public void signal() {

        try {
            reentrantLock.lock();
            System.out.println("begin signal() ThreadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            condition.signal();
            Thread.sleep(5000);
            System.out.println("  end signal() ThreadName="
                    + Thread.currentThread().getName() + " time="
                    + System.currentTimeMillis());
            System.out.println("signal执行完不释放锁，执行完同步方法才释放锁");




        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
            System.out.println("当前线程名称：" + Thread.currentThread().getName() + " 锁释放了");
        }
    }

}