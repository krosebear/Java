
public class Samurai extends Human {
	private int health = 200;
	private static int counter;

	public Samurai(String name) {
		super(name);
		this.health = 200;
		counter++;
	}
	public void deathBlow(Human h){
		System.out.println("Death blow..");
		h.health = 0;
		health = health / 2;
	}

	public int getHealth() {
		System.out.println(this.name + " has " + health + " health.");
		return health;
	}
	public void meditate() {
		health = health + health / 2;
	}
	
	public static void howMany(){
		System.out.println("There are " + counter + " Samurais");
	}
}	
