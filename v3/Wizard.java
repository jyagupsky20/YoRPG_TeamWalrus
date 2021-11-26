public class Wizard extends Protagonist{
  public Wizard(String name){
    super(name, 5, 10, 1.0);
  }
  public static String about(){
    return "The wizard can cast magic spells.\nIts special ability is the option to try a strong spell, but the wizard will take damage";
  }
  public void offerChoice(){
    this.attack_rating = 1.0;
    System.out.println( "\nDo you want to try a strong attack? This will cost you some health." );
    System.out.println( "\t1: Nay.\n\t2: Aye!" );
  }
  public void makeDecision(String in){
    int i = Integer.parseInt( in );
    if ( i == 2 ){
      this.health -= 5;
      this.attack_rating = 5.0;
    }
  }
}
/*
Can damage itself for a very strong attack
*/
