package Homework3;

public class Cat extends Animal {
	private static int population = 0;

	@Override
	public void giveBirth() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "'s baby.");
		super.giveBirth();
	}

	public Cat() {
		super();
		population++;
		// TODO Auto-generated constructor stub
	}

	public Cat(String name) {
		super(name);
		population++;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeASound() {
		// TODO Auto-generated method stub
		System.out.print(getName());
		super.makeASound();
		System.out.println("Meow meow");
	}

	@Override
	public void introduce() {
		makeASound();
		System.out.println("I am " + getName());
		// TODO Auto-generated method stub
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		Cat.population = population;
	}

}
