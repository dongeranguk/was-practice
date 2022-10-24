package org.example;

public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        /**
         * 서블릿 객체를 싱글톤으로 관리하므로 상태가 유지(stateful)하게 설계하면 안된다.
         */

        Thread thread1 = new Thread(counter, "Thread1");
        Thread thread2 = new Thread(counter, "Thread2");
        Thread thread3 = new Thread(counter, "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
