package com.limin.designparttern.singleton;

public class LazyDoubleCheckSingleton {
    // volatile 线程安全的初始化，禁止重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 1. 分配内存给这个对象
                    // 2. 初始化对象
                    // 3. 设置lazyDoubleCheckSingleton指向刚分配的内存

                    // 重排序问题，可能对上述3个顺序进行重排序， 1-》3-》2
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
