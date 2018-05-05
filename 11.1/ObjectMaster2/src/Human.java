
public class Human {
	protected int strength  = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	public String name;
	public Human(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int attack(Human human) {
		human.health -= this.strength;
		System.out.println(human.name +" was attacked by "+ this.name + "!");
		return this.health;
		
	}
}
