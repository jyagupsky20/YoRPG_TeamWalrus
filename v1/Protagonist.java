public class Protagonist {
  String name = "";
  public Protagonist(int health, int strength, int defense, double attack_rating, String name){
    super(int health, int strength, int defense, double attack_rating)
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void specialize(){
    attack_rating = 15;
  }
  public void normalize(){
    attack_rating = 10;
  }
}
