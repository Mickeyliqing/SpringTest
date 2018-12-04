package com.spring.demo.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	private Object target;

	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}
	public Object getProxyFactory(){
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						System.out.println("开始事务");
						Object returnValue = method.invoke(target, args);
						System.out.println("结束事务");
						return returnValue;
					}
				});
	}
}
