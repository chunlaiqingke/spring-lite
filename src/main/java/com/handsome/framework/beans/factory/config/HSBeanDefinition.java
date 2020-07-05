package com.handsome.framework.beans.factory.config;

/**
 * 用于存储配置文件中的信息
 * 相当于在内存中的配置
 */
public class HSBeanDefinition {
    //原生bean的全限定名
    private String beanClassName;
    //是否延时加载
    private boolean lazyInit = false;
    //保存beanName，在ioc容器中存储的key
    private String factoryBeanName;

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public String getFactoryBeanName() {
        return factoryBeanName;
    }

    public void setFactoryBeanName(String factoryBeanName) {
        this.factoryBeanName = factoryBeanName;
    }
}
