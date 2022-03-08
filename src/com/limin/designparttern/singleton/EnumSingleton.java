package com.limin.designparttern.singleton;

public enum EnumSingleton {
    INSTANCE {
        protected void printTest() {
            System.out.println("EnumSingleton print test");
        }
    };
    private Object data;

    protected abstract void printTest();

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
