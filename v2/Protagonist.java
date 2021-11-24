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
  public void makeDecision(){
    System.out.println("No decision to be made here. This is the default case.")
  }
}
