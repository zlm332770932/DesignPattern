package com.limin.designparttern.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
        //反射防御，对在类加载时就创建好单例对象是有效的
        if (hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    //解决序列化和反序列化破坏单例模式
    private Object readResolve(){
        return hungrySingleton;
    }
}
