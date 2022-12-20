public class TransactionValidator {

    static final double MIN_AMOUNT = 1d;
    static final double MAX_AMOUNT = 5000d;

    public static boolean isValidAmount(double amount) {
        if ((amount < MIN_AMOUNT)) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        if ((amount > MAX_AMOUNT)) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }
}






  /*  public static boolean () {

        if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
        }

        if (){
        System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");


    }



    }



    // объявите константы

    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода */

