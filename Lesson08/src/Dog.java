public class Dog extends Pet{
    public Dog() {
        super();
    }

    @Override
    public String sleep() {
        return "Сплю";
    }

    @Override
    public String play() {
        return "Играю";
    }

    @Override
    public String giveVoice() {
        return "РРРР";
    }

    public Dog(String voice) {
        super(voice);
    }
    public static void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
