import Packet.Phone;

public class Main {
    public static void main (String[] args){
        Phone phone = new Phone("+7(777)777-77-77","Oppo Reno","Kirill","650 gramm");
        Phone phone1 = new Phone("+7(707)540-11-16","Vivo Y6","Danil","850 gramm");
        Phone phone2 = new Phone("+7(705)220-30-77","Rexona","Alex","750 gramm");
        System.out.println(phone.getNumber() +" "+ phone.getModel() +" "+ phone.getOwnerName() +" "+ phone.getWeight());
        System.out.println(phone1.getNumber() +" "+ phone1.getModel() +" "+ phone1.getOwnerName() +" "+ phone1.getWeight());
        System.out.println(phone2.getNumber() +" "+ phone2.getModel() +" "+ phone2.getOwnerName() +" "+ phone2.getWeight());
        phone.receiveCall();
        System.out.println(phone.getNumber());
    }
}