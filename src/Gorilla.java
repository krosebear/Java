public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("The Gorilla throws a banana!");
		this.energyLevel = energyLevel - 5;
	}

	public void eatBanana() {
		System.out.println("Eating a banana. Yum Yum YuM!");
		this.energyLevel = energyLevel + 10;
	}

	public void climb() {
		System.out.println("Climbing a tree now!");
		this.energyLevel = energyLevel - 10;
	}
	
}
