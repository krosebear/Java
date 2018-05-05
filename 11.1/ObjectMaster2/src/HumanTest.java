
public class HumanTest {
	public static void main(String[] args) {
		Human johnny = new Human("johnny");
		Human hanh = new Human("Hanh");
		Ninja spencer = new Ninja("spencer");
		Wizard kendra = new Wizard("kendra");
		Samurai rachel = new Samurai("rachel");
		johnny.attack(hanh);
		
		spencer.steal(kendra);
		kendra.getHealth();
		kendra.fireball(spencer);
		spencer.getHealth();
		rachel.deathBlow(spencer);
		rachel.getHealth();
		spencer.getHealth();
		kendra.heal(rachel);
		rachel.getHealth();
		}

}
