package cn.why.thread.wait.list;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private static List list = new ArrayList();

	public static void add() {
		list.add("why");
	}

	public static int size() {
		return list.size();
	}

}