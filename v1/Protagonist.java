public class Protagonist extends Character{
  String name = "";
  boolean strongAttack = false;
  public Protagonist(String name){
    super(100, 20, 5, 1.0);
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void specialize(){
    attack_rating = 2.5;
    strongAttack = true;
  }
  public void normalize(){
    attack_rating = 1.0;
    strongAttack = false;
  }
  public int attack(Character defendant){
    this.defense = 5;
    int damage;
    if(!strongAttack){
      damage = super.attack(defendant);
    }
    else{
      if(Math.random() > 0.1){
        damage = super.attack(defendant);
      }
      else{
        this.defense = 3;
        damage = 0;
      }
    }
    return damage;
  }
}
