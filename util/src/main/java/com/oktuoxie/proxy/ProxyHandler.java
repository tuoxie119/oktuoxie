package com.oktuoxie.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ����˫
 * @version V1.0
 * @Title: StoreServiceQueryDto.java
 * @Package com.oktuoxie.proxy
 * @Description: query
 * @date 2016/9/21
 * @Copyright: Copyright 2007-2015 www.zgxcw.com.cn All Rights Reserved
 * @Company: ����޳���
 */
public class ProxyHandler implements InvocationHandler {
    private Object proxied;

    public ProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //��ת������Ŀ�����֮ǰ������ִ��һЩ���ܴ���

        //ת������Ŀ�����ķ���
        return method.invoke(proxied, args);

        //��ת������Ŀ�����֮�󣬿���ִ��һЩ���ܴ���
    }
}
