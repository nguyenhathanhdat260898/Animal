package Homework3;

public class Cow extends Animal {
	private int population = 0;

	@Override
	public void giveBirth() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "'s baby.");
		super.giveBirth();
	}

	public Cow() {
		super();
		// TODO Auto-generated constructor stub
		population++;
	}

	public Cow(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		population++;
	}

	@Override
	public void makeASound() {
		// TODO Auto-generated method stub
		System.out.print(getName() +" ");
		System.out.println("Bowwwwwwwww ");
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
