public class SuperHero {
 // Declare attributes: name, ability, and powerLevel
 String name,ability;
 int Powerlevel;
 
    // Constructor to initialize name, ability, and powerLevel
  public SuperHero(String n,String a,int p){
    name=n;
    ability=a;
    Powerlevel=p;
  }
 
    // Method: displayHero
    public void displayHero() {
        // Print the hero's name, ability, and power level
        System.out.println(name+ability+Powerlevel);
    }

    
}
