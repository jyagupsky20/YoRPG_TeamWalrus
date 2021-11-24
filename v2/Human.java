public class Human extends Protagonist {
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
  public void makeDecision(){
    try {
      System.out.println( "\nDo you feel lucky?" );
      System.out.println( "\t1: Nay.\n\t2: Aye!" );
      i = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }

    if ( i == 2 )
      pat.specialize();
    else
      pat.normalize();
  }
}
