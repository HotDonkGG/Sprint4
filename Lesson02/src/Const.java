public class Const {
    public static final int MIN_PASSWORD_LENGTH = 8;
    public static final int PHONE_LENGTH = 11;
    public static void validateCredentials(String phone, String password) {

        if (phone.length() != 11) {

            System.out.println("Введите номер в формате 7xxxxxxxxxxx, где x - любая цифра.");
        }
        if (password.length() < 8) {
            System.out.println("Минимальная длина пароля: 8 знаков.");
        }
    }

    public static void main(String[] args) {

        validateCredentials("7901000000", "Qwerty");
    }
}