package ga.rubok.level5;

public class AnimalMission {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Sparrow spa = new Sparrow();
		
		doCry(dog);
		doCry(cat);
		doCry(spa);
	}

	static void doCry(Animal ani) {
		ani.cry();
	}
}
