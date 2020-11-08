package Homework3;

public class Dog extends Animal {
	private int population = 0;

	@Override
	public void giveBirth() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "'s baby.");
		super.giveBirth();
	}

	public Dog() {
		super();
		population++;
		// TODO Auto-generated constructor stub
	}

	public Dog(String name) {
		super(name);
		population++;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeASound() {
		// TODO Auto-generated method stub
		System.out.print(getName() +" ");
		System.out.println("Gauw Gauww ");
	}

	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		makeASound();
		System.out.println("I am " + getName());
		// TODO Auto-generated method stub
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
