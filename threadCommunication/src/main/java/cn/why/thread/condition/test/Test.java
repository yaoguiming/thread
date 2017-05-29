package cn.why.thread.condition.test;


import cn.why.thread.condition.mylist.MyList;
import cn.why.thread.condition.extthread.ThreadA;
import cn.why.thread.condition.extthread.ThreadB;

public class Test {

	public static void main(String[] args) {

		/**
		 * 线程A，B可能争抢输出，导致另一个线程的输出不可见，就会造成输出错觉，以为没正常秩序
		 */
		MyList service = new MyList();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

	}

}