
public class Ninja extends Human {
	public Ninja(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	private int stealth = 10;


	public int getStealth() {
		System.out.println(stealth);
		return stealth;
	}
	public int getHealth() {
		System.out.println(this.name + " has " + health + " health.");
		return health;
	}

	public void steal(Human h){
		System.out.println("Stealing from "+ h.name);
		h.health = h.health - stealth;
		health += stealth;
	}
}
