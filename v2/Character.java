public class Character{
	protected int health;
	protected int strength;
	protected int defense;
	protected double attack_rating;
	public Character(int health, int strength, int defense, double attack_rating){
		this.health = health;
		this.strength = strength;
		this.defense = defense;
		this.attack_rating = attack_rating;
	}
	public boolean isAlive(){
    return (health > 0);
  }
	public int getDefense(){
		return defense;
	}
	public void lowerHP(int amount){
		health -= amount;
	}
	public int attack(Character defendant){
		int damage = (int) Math.max((this.strength*this.attack_rating)-defendant.getDefense(),0);
		defendant.lowerHP(damage);
		return damage;
	}
	public String about(){
		System.out.println("This is a generic character. This shouldn't display.")
	}
}
