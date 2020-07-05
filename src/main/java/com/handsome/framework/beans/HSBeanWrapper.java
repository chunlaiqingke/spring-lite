package com.handsome.framework.beans;

/**
 * 用于封装创建后的对象实例，代理对象或者原生对象都由BeanWrapper保存
 */
public class HSBeanWrapper {
    private Object wrappedInstance;
    private Class<?> wrappedClass;

    public HSBeanWrapper(Object wrappedInstance) {
        this.wrappedInstance = wrappedInstance;
        this.wrappedClass = wrappedInstance.getClass();
    }

    public Object getWrappedInstance() {
        return wrappedInstance;
    }

    public Class<?> getWrappedClass(){
        return wrappedClass;
    }
}
