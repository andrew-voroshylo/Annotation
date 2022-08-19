package net.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student1")
public class PhoneA implements Phone {

	private Service service;
	
	@Autowired
	public PhoneA(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void findPhone() {
		String info = service.getInfo();
		System.out.println(info);

	}

}
