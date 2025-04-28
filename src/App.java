public class App {
    public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
 
        // Example:
         String[] heroNames = {"mark","dave","bill","The Destroyer of Worlds Steven Universe","Big BIg Big Big Big WOW"};
         String[] abilities = {"milk","milk 2","IBS","The GodRay of Hyperdeath","Even Bigger Wow"};
        int[] powerLevels = {2,4,40000,600,1460};
 
        // 2. Print each hero's details using a loop
         for (int i = 0; i < heroNames.length; i++) {System.out.println(heroNames[i]+"\n");}
 
        // 3. Call the searchHero method to find a specific hero by name
        searchHero(heroNames, abilities, powerLevels, "dave");
 
        // 4. Calculate and display the average power level by calling calculateAveragePower method
        System.out.println(calculateAveragePower(powerLevels)+"\n");

        SuperHero[] Heroes = new SuperHero[5];

        for (int index = 0; index < Heroes.length; index++) {
            Heroes[index] =new SuperHero("Dave" + index, "Soda" + index, index*2);
        }

        System.out.println("it is Populated, LIKE REALLLLY Populated");
       
        





    };

  // Method: searchHero
  public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
    // Implement a loop to search for the hero by name
    // If found, print the hero's details
    // If not found, display a message
   for (String i : names) {
    if (i.equals(target)) {
        System.out.println("Target found " + i +"\n");
        return;
    };
    

    
   };
   System.out.println("Query Not Found \n");
   
}

// Method: calculateAveragePower
public static double calculateAveragePower(int[] powerLevels) {
    // Implement the calculation for average power level
    // Return the calculated average
    int out = 0;
for (int i : powerLevels) {
    out +=i;
}

    return (out/powerLevels.length); 
};
}
