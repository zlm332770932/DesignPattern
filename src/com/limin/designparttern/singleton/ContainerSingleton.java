package com.limin.designparttern.singleton;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {
    //HashMap线程不安全
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    private ContainerSingleton() {
    }

    public static void putInstance(String key, Object instance) {
        if (key != null && key.length() > 0 && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }

}
