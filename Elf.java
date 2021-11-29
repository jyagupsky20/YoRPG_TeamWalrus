public class Elf extends Protagonist {
  public Elf(String name){
    super(name, 17, 15, 1.0);
  }
  public static String about(){
  	return "The elf is slightly weaker than the human, but can use magic.\nIts special ability is to perform a healing strike, which is weaker than a normal attack, but will restore the elf's HP";
  }
  public void offerChoice(){
    this.attack_rating = 1.0;
    System.out.println( "\nDo you want to try a healing strike? This will weaken you, but you will heal a bit." );
    System.out.println( "\t1: Nay.\n\t2: Aye!" );
  }
  public void makeDecision(String in){
    int i = Integer.parseInt( in );
    if ( i == 2 ){
      this.health += 5;
      this.attack_rating = 0.5;
    }
  }
}
/*
Does weak attack that heals the elf
*/
