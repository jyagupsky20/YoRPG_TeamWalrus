public class Human extends Protagonist {
  public Human(String name){
    super(name, 5, 10, 1.0);
  }
  public static String about(){
    return "The human is the average character.\nIts special ability is the option to try a strong attack, but this can backfire.";
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
  public void offerChoice(){
    System.out.println( "\nDo you want to try a strong attack? You may lose defense temporarily." );
    System.out.println( "\t1: Nay.\n\t2: Aye!" );
  }
  public void makeDecision(String in){
    int i = Integer.parseInt( in );
    if ( i == 2 )
      this.specialize();
    else
      this.normalize();
  }
}
