// Дополните класс для проверки суммы ипотеки пользователя
public class MortgageAmountValidationRule extends ValidationRule<Integer> {

    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    @Override
    public boolean isValid() {
        if (value > 1000000 && value < 10000000) {
            return true;
        }
        return false;
    }


    // Объявите и реализуйте метод для проверки суммы ипотеки ниже


}