package net.genspark;

import org.springframework.stereotype.Component;

@Component("service")
public class ServiceA implements Service {

	private String mob = "8433290923";
	
	@Override
	public String getInfo() {
		String info = "Phone Number:" + mob;
		return info;
	}

}
