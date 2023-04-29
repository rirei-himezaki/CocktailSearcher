package model;

import java.io.Serializable;

public class CocktailModel implements Serializable{

	private String[] base;
	private String[] degree;
	private String[] taste;
	private String[] glass;
	private String[] temperature;
	
	public CocktailModel() {
		}

	public String[] getBase() {
		return base;
	}

	public void setBase(String[] base) {
		this.base = base;
	}

	public String[] getDegree() {
		return degree;
	}

	public void setDegree(String[] degree) {
		this.degree = degree;
	}

	public String[] getTaste() {
		return taste;
	}

	public void setTaste(String[] taste) {
		this.taste = taste;
	}

	public String[] getglass() {
		return glass;
	}

	public void setglass(String[] glass) {
		this.glass = glass;
	}

	public String[] getTemperature() {
		return temperature;
	}

	public void setTemperature(String[] temperature) {
		this.temperature = temperature;
	}
	
	
	
}
