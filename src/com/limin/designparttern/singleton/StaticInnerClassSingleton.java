package com.limin.designparttern.singleton;


public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        //反射防御，对在类加载时就创建好单例实例是有效的
        if (InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    //静态内部类，对象初始化锁，解决重排序问题
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton
                = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
