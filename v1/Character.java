public class Character{
	int health;
	int strength;
	int defense;
	double attack_rating;
	public Character(int health, int strength, int defense, double attack_rating){
		this.health = health;
		this.strength = strength;
		this.defense = defense;
		this.attack_rating = attack_rating;
	}
	public boolean isAlive(){
    return health > 0;
  }
	public int getDefense(){
		return defense;
	}
	public void lowerHP(int amount){
		health -= amount;
	}
}
