package aop_ann;

import org.springframework.stereotype.Component;

@Component 
public class Hello implements Printable  {
	public void print() {
		System.out.println("Hello World!");
	}
//
//	public void process(int v){
//		if ( v < 0)
//			  throw new RuntimeException ("Invalid Number....");
//		
//	}
	

}
