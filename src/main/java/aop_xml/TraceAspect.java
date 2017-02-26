package aop_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TraceAspect {

	public void beforeMethod(JoinPoint method) {
		System.out.printf("Entering Method : %s\n", method.getSignature());
	}

	public void afterMethod(JoinPoint method) {
		System.out.printf("Exiting Method : %s\n", method.getSignature());
	}

	public void afterSuccess(JoinPoint method) {
		System.out.println("Done Successfully!");
	}

	public void afterFailure(JoinPoint method) {
		System.out.println("Failed");
	}

	public void afterThrowing(RuntimeException ex) {
		System.out.println("Error --> " + ex);
	}

	public void aroundAdvice(ProceedingJoinPoint method) {
		System.out.println("About to call method ->" + method.getSignature());
		try {
			method.proceed(method.getArgs());  // calling method 
			System.out.println("Successfully processed ");
		} catch (Throwable ex) {
			System.out.println("Failure..");
		}
		System.out.println("Completed call to call method ->" + method.getSignature());
	}

}
