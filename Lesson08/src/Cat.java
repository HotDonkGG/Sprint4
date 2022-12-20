public class Cat extends Pet{
    public Cat() {
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
        return "Мяу";
    }

    public Cat(String voice) {
        super(voice);
    }

    @Override
    public int getPawsCount() {
        return super.getPawsCount();
    }

    @Override
    public void setPawnsCount(int pawnsCount) {
        super.setPawnsCount(pawnsCount);
    }

    public static void catchMouse() {
        System.out.println("Поймала мышку!");
    }
}
