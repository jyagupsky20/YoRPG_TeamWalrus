public class Elf extends Protagonist {
  public Elf(String name){
    super(name, 5, 10, 1.0);
  }
  public static String about(){
  	return "The elf is slightly weaker than the human, but can use magic.\nIts special ability is to perform a healing strike, which is weaker than a normal attack, but will restore the elf's HP";
  }
}
/*
Does weak attack that heals the elf
*/
