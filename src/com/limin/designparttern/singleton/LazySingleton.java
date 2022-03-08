package com.limin.designparttern.singleton;

public class LazySingleton {
    private static LazySingleton singleton = null;

    private LazySingleton() {

    }

    /*
     * synchronized 同步方法
     * 加到静态方法上，锁是整个class文件，在堆内存中生成，对性能有影响
     *
     */
    public synchronized static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

}
