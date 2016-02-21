package de.hsw.jee.sample;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class HelloForm {
	
	private String name = null;

	public String sayHello(){
		System.out.println("Sag Hallo zu message" + name);
		return "helloform.jsf";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
