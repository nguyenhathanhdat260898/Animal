package Homework3;

public abstract class Animal {
	private String name;

	public abstract void introduce();

	public void makeASound() {

	}

	public void giveBirth() {

	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
