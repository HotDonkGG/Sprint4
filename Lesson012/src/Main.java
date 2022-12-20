import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Вас приветствует виртуальная АТС!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш номер телефона:");
        String number = scanner.next();
        System.out.println("Введите номер пользователя, которому хотите позвонить:");
        String friendNumber = scanner.next();
        System.out.println("Выберите вашу модель телефона, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
        int type = scanner.nextInt();

        if (type < 1 || type > 3) {
            System.out.println("Введена неверная модель телефона");
            return;
        }

        getPhone(type, number).makeCall(friendNumber);
    }

    public static Phone getPhone(int type, String number) {
        if (type == 1) {
            return new CellularPhone(number);
            // Если выбран стационарный телефон, создайте объект класса CellularPhone

        } else if (type == 2) {
            return new MobilePhone(number);
            // Если выбран мобильный телефон, создайте объект класса MobilePhone

        } else {
            // Иначе создайте экземпляр класса Smartphone
            return new MobilePhone(number);
        }

    }


}