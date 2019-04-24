package org.selenium.Selenium;

public class Fibanocci {

	
public static void main(String[] args) {
	//0 1 1 2 3 5 8 
	int n=10,t1=0,t2=1;
	
	System.out.println("Fibanocci series of first n"+n+ "terms" );
	
	for (int i=0;i<=n;i++) {
		System.out.println(t1);
		int sum= t1+t2;
		t1=t2;
		t2=sum;
		
		
	}
	
}
}
