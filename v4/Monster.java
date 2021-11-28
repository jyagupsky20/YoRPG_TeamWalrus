public class Monster extends Character{
  public Monster(int strength, int defense) {
    super(50, strength, defense, 1.0);
  }
  public static String about(){
    return "This is a generic monster about, and shouldn't come up during play.\n Please contact the developers.";
  }
}
/*
One monster will have normal stats, one will attack well but will have lower defense, one will defend well but
be worse at attacking.
*/
