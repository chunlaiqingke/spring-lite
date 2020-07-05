package com.handsome.framework.beans.factory;

/**
 * IOC实现的顶层抽象类
 */
public abstract class HSAbstractApplicationContext {

    //只允许子类重写
    protected abstract void refresh() throws Exception;
}
