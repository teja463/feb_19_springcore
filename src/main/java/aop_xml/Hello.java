package aop_xml;

public class Hello {
	public void print() {
		System.out.println("Hello World!");
	}
	
	public void process(int v) {
	if ( v < 0 )  
		throw new RuntimeException("Invalid number!");
	else
		System.out.println("Do Process for number " + v);
	}
}
