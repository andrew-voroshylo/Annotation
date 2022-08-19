package net.genspark;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDIAnnotations {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("net.genspark");
		appContext.refresh();
		
		Phone phoneA = (Phone) appContext.getBean("student1");
		phoneA.findPhone();
	}

}
