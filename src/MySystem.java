import java.util.ArrayList;

public class MySystem {
    ArrayList<Owner> owners = new ArrayList<>(); //skapar en ArrayList som innehåller objekten owner

    MySystem() {
        start();
    }

    public void start() {

        for (int i = 0; i < 3; i++) { //Skapar 3 st owners
            System.out.println("Write the name of the owner");
            owners.add(new Owner()); //Här läggs varje ny owner in i ArrayListen
        }

        System.out.println("List of owners:");
        int numberOfOwner = 0;
        for (Owner own : owners) { //for-each loop, för varje owner som finns ska en sak göras (i detta fall ska namn osv skrivas ut)
            numberOfOwner++; //räknare för antal owners
            System.out.println(+numberOfOwner + ". " + own.name); //Skriver ut antal owners som lagts till och deras namn
        }
    }

}
