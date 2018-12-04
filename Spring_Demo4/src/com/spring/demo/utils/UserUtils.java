package com.spring.demo.utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class UserUtils {
	
	public void begin(){
		System.out.println("这是开始方法");
	}

	public void after(){
		System.out.println("这是一个结束方法");
	}

	public void afterReturn(){
		System.out.println("这是一个方法结束后执行的方法");
	}

	public void afterThrow(){
		System.out.println("这是一个方法出现异常后执行的方法");
	}

	public void around(ProceedingJoinPoint point) throws Throwable{
		System.out.println("环绕前···");
		point.proceed();
		System.out.println("环绕结束···");
	}
}
