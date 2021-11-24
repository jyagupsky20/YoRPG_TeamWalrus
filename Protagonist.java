public class Protagonist extends Character{
  String name = "";
  boolean strongAttack = false;
  public Protagonist(String name, int strength, int defense, double attack_rating){
    super(100, strength, defense, attack_rating);
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void offerChoice(){
    System.out.println("No choice to be offered here. This is the default case.");
  }
  public void makeDecision(String in){
    System.out.println("No decision to be made here. This is the default case.");
  }
}
