package Packet;

public class Phone {
    String number;
    String model;
    String ownerName;
    String weight;

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getWeight() {
        return weight;
    }

    public Phone(String number, String model, String ownerName, String weight) {
        this.number = number;
        this.model = model;
        this.ownerName = ownerName;
        this.weight = weight;
    }
    public Phone(String number, String model){
        this.model=model;
        this.number=number;
    }
    public void receiveCall () {
        System.out.println("Звонит " + ownerName);
    }

}
