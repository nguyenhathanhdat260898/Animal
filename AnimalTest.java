package Homework3;

public class AnimalTest {
	public static void main(String[] args) {
		//mục 1 2: 
		Cat cat = new Cat("Meo");
		Cat cat2 = new Cat("Meo2");
		Cat cat3 = new Cat("Meo3");
		Cat cat4 = new Cat("Meo4");
		Cat cat5 = new Cat("Meo5");
		cat.introduce();
		cat2.introduce();
		cat3.introduce();
		cat4.introduce();
		cat5.introduce();
		Dog dog = new Dog("Dog");
		dog.introduce();
		Cow cow = new Cow("Cow");
		cow.introduce();
		System.out.println("-------------------");
		
		//muc 3:
		System.out.println(cat.getPopulation());
		System.out.println("-------------------");
		
		//muc 4:
		cat.giveBirth();
		System.out.println("-------------------");
		
		//muc 5:
		cat=null;
		System.gc();
	}
}
