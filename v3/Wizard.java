public class Wizard extends Protagonist{
  public Wizard(String name){
    super(name, 5, 10, 1.0);
  }
  public static String about(){
    return "The wizard can cast magic spells.\nIts special ability is the option to try a strong spell, but the wizard will take damage";
  }
}
/*
Can damage itself for a very strong attack
*/
