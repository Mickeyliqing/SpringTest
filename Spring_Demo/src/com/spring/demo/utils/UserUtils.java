package com.spring.demo.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class UserUtils {

	@Pointcut("execution(* com.spring.demo.dao.*.*(..))")
	public void pointCut(){
		
	}
	@Before("pointCut()")
	public void begin(){
		System.out.println("这是开始方法");
	}
	@After("pointCut()")
	public void after(){
		System.out.println("这是一个结束方法");
	}
	@AfterReturning("pointCut()")
	public void afterReturn(){
		System.out.println("这是一个方法结束后执行的方法");
	}
	@AfterThrowing("pointCut()")
	public void afterThrow(){
		System.out.println("这是一个方法出现异常后执行的方法");
	}
	@Around("pointCut()")
	public void around(ProceedingJoinPoint point) throws Throwable{
		System.out.println("环绕前···");
		point.proceed();
		System.out.println("环绕结束···");
	}
}
