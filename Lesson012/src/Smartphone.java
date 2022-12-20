// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone{

    public Smartphone(String number) {
        super(number);
    }
@Override
public void makeCall(String targetNumber, String appName){
    System.out.println("Звоним с номера " + number);
    System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
    System.out.println("Привет!");
        }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

}