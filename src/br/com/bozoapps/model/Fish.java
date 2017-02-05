package br.com.bozoapps.model;

public class Fish {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String swim(){
		return this.name+" nada...";
	}

}
