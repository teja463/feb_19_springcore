package aop_ann;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TraceAspect {

	@Pointcut("execution ( * * (..))")
	public void aopMethods() {
	}

	@Before("aopMethods()")
	public void beforeMethod(JoinPoint method) {
		System.out.printf("Entering Method : %s\n", method.getSignature());
	}

	@After("aopMethods()")
	public void afterMethod(JoinPoint method) {
		System.out.printf("Existing Method : %s\n", method.getSignature());
	}
	
	@AfterThrowing("aopMethods()")
	public void afterError(JoinPoint method) {
		System.out.printf("Existing Method  with error : %s\n", method.getSignature());
	}

}
