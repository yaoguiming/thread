package cn.why.thread.pipe.readerwriter.extthread;


import cn.why.thread.pipe.readerwriter.service.ReadData;

import java.io.PipedReader;

public class ThreadRead extends Thread {

	private ReadData read;
	private PipedReader input;

	public ThreadRead(ReadData read, PipedReader input) {
		super();
		this.read = read;
		this.input = input;
	}

	@Override
	public void run() {
		read.readMethod(input);
	}
}