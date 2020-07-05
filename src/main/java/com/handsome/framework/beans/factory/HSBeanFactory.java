package com.handsome.framework.beans.factory;

public interface HSBeanFactory {

    Object getBean(String beanName) throws Exception;

    Object getBean(Class<?> beanClass) throws Exception;
}
