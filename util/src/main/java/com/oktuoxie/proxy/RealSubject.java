package com.oktuoxie.proxy;

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
public class RealSubject implements Subject {
    public void doSomething() {
        System.out.println("call doSomething()");
    }
}
