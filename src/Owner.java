import java.util.Scanner;

public class Owner { //Klass för alla owners/ägare, här sparas deras namn
    String name;


    public Owner() { //Metod för att skapa alla Owners, jag har valt att skriva/läsa in de med en scanner
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();

    }
}
