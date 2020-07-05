package com.handsome.framework.beans.factory;

import com.handsome.framework.beans.factory.config.HSBeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//这是最经典的容器
public class HSDefaultListableBeanFactory implements HSBeanFactory {

    //存储注册信息的beanDefinition
    private final Map<String, HSBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, HSBeanDefinition>();

    public Object getBean(String beanName) throws Exception {
        return null;
    }

    public Object getBean(Class<?> beanClass) throws Exception {
        return null;
    }
}
