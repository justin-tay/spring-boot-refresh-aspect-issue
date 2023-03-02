package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class DemoControllerAspect {
	private Logger logger = LoggerFactory.getLogger(DemoControllerAspect.class);
	
	@Around("within(@org.springframework.web.bind.annotation.RestController *)")
//	@Around("execution(* com.example.demo.api.DemoController.*(..))")
	public Object invokeAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		logger.info("Invoked");
		return proceedingJoinPoint.proceed();
	}
}
