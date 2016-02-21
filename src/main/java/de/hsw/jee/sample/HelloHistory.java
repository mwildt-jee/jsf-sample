package de.hsw.jee.sample;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="helloHist")
@SessionScoped
public class HelloHistory {
	
	private String name = null;
	private List<String> names = new ArrayList<String>();
	
	public String sayHello(){
		System.out.println("Sag Hallo zu message" + name);
		this.names.add(this.name);
		return "hellohistory.jsf";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	
}
