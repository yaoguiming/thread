package com.why.syncmethod;

/**
 * 非线程安全问题出现在实例变量中，如果某个方法的私有变量，则不存在非线程安全问题
 * @author why
 * @date 2017/4/21 16:02
 */
public class ThreadA extends Thread{

    private TwoObjectTwoLock twoObjectTwoLock;

    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        this.myObject = myObject;
    }

    public ThreadA(TwoObjectTwoLock twoObjectTwoLock) {
        this.twoObjectTwoLock = twoObjectTwoLock;
    }

    @Override
    public void run() {
        super.run();
//        twoObjectTwoLock.addNum("a");

        myObject.methodA();
    }

}
