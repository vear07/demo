package com.ffcs.aop;

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
public class LogPrint {
	@Pointcut("execution(* com.ffcs.ioc.service..*.*(..))")
	private void anyMethod() {
	}

	@Before("anyMethod()")
	public void doAccessCheck() {
	}

	@AfterReturning(pointcut = "anyMethod()", returning = "revalue")
	public void doReturnCheck(String revalue) {
	}

	@AfterThrowing(pointcut = "anyMethod()", throwing = "ex")
	public void doExceptionAction(Exception ex) {
	}

	@After("anyMethod()")
	public void doReleaseAction() {
	}

	@Around("anyMethod()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		Object obj = pjp.proceed();
		return "HI! "+String.valueOf(obj);
	}
}
