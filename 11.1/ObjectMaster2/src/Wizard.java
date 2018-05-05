
public class Wizard extends Human {
	public Wizard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private int health = 50;
	private int intelligence = 8;

	public void heal(Human h){
		System.out.println("Healing "+ h.name);
		h.health = h.health + intelligence;
	}

	public int getHealth() {
		System.out.println(this.name + " has " + health+ " health.");
		return health;
	}


	public int getIntelligence() {
		System.out.println(intelligence);
		return intelligence;
	}


	public void fireball(Human h){
		System.out.println("Fireballing " + h.name);
		h.health = h.health - (intelligence * 3);
	}
}
