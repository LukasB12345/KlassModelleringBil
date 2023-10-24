public class Car {
    //Attributes
    private int id;
    private String brand;
    private double speed = 0.0;
    private int mileage = 0;
    private Owner owner; //ägaren här är ägarklassen (Owner)

    private int value;

    //Constructor
    public Car(int id, String brand, int value) {
        this.id = id; //this syftar på objektets (bilens) attribut
        this.brand = brand;
        this.value = value;
    }


    public void speedUp(double increase) {
        if (this.speed + increase <= 220) {
            this.speed = this.speed + increase; //ändrar hastigheten till orginalhastigheten + den hastighetsökning som lagts till
            mileage += 10; //Varje gång en bil åker snabbare så åker den en bestämd längd på 10 miles, vilket läggs till i mileage
        } else {
            System.out.println("Too large increase");
        }
    }

    public void slowDown(double decrease) {
        if (this.speed - decrease < 0) { //Sänker hastighetsvariabelns värde med värdet av variabeln decrease


            this.speed = this.speed - decrease;
        } else {
            System.out.println("Too large decrease");
        }
    }

    //Methods
    public void stop() {
        this.speed = 0;
    } //Bilen stoppas genom att sätta hastighetsvariabeln till 0

    public int getID() {
        return this.id;
    } //returnerar ID

    public String getBrand() {
        return this.brand;
    } //returnerar brand

    public double getSpeed() {
        return this.speed;
    } //returnerar hastigheten

    public int getMileage() {
        return this.mileage;
    } //returnerar mileage

    public Owner getOwner() {
        return this.owner; //Returnerar owner som hämtas från klassen owner
    }

    public void setOwner(Owner owner) {

    }

    public int getValue() {
        return this.value;
    }


}
