package com.why.thread.test;

import com.why.thread.task.extthread.TaskA;
import com.why.thread.task.extthread.TaskB;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TaskQueueTest {

    public static void main(String[] args) {
        TaskA taskA = new TaskA();
        TaskB taskB = new TaskB();


        Calendar calendar = Calendar.getInstance();

        Date date1 = calendar.getTime();
        calendar.add(Calendar.SECOND, 10);

        Date date2 = calendar.getTime();

        Timer timer = new Timer();
        timer.schedule(taskA, date1);
        timer.schedule(taskB, date2);

    }
}
